package zz2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class randomChinese {
    public static void main(String[] args) {
//        char result1 = (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
//        char result2 = (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
//        char result3 = (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
//        char result4 = (char) (0x4e00 + (int) (Math.random() * (0x9fa5 - 0x4e00 + 1)));
//        System.out.println(result1+""+result2+""+result3+""+result4);
        String writeFile = "D:\\大四上\\专综2\\123.csv";
        try (BufferedWriter writeText = new BufferedWriter(new FileWriter(writeFile,true))){
            //第二步：通过BufferedReader类创建一个使用默认大小输出缓冲区的缓冲字符输出流
            //第三步：将文档的下一行数据赋值给lineData，并判断是否为空，若不为空则输出2
            //换行
            //调用write的方法将字符串写到流中
                writeText.write("123456");
                writeText.newLine();
                writeText.write("123456789");
                writeText.newLine();
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
