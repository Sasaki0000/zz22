package zz2.support;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class WtoL {
    String host = "10.7.122.37";//windos到linux用外网IP就可以,但linux上传到linux要涉及网段、防火墙等，所以这里用的是内网IP
    int port = 6666;
    String username = "root";
    String password = "123456";
    public boolean update(){
        try {
            JSch jsch = new JSch();
            jsch.getSession(username, host, port);
            Session sshSession = jsch.getSession(username, host, port);
            sshSession.setPassword(password);
            Properties sshConfig = new Properties();
            sshConfig.put("StrictHostKeyChecking", "no");
            sshSession.setConfig(sshConfig);
            sshSession.connect();
            Channel channel = sshSession.openChannel("sftp");
            channel.connect();
            ChannelSftp sftp = (ChannelSftp) channel;
            sftp.cd("/usr/local/flume/zz2/");//上传时接文件的服务器的存放目录

            InputStream is = null;
            int k=0;
            for(File file: new File("D:\\专综2data").listFiles()){
                String fileName =file.getName();
                System.out.println(k+++"---"+fileName);
                is = new FileInputStream(file);
                sftp.put(is, fileName, ChannelSftp.OVERWRITE);//有重名文件覆盖
            }
            sshSession.disconnect();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
