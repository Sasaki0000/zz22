package zz2.entity;

import com.github.javafaker.Faker;
import zz2.RandomNum;

import java.io.*;
import java.util.*;


public class CreateData {

    public static List<String> novelTypes = new ArrayList<>();
    public static int number=1;


    public static String Randomer(double DataSize, double Recommend_up, double Click_up,
                                  double WeekRecommend_up, double Words1, double Words2, double Words3,
                                  double Words4){

        String[] arr1=new String[]{"奇幻玄幻", "武侠仙侠", "历史军事", "都市娱乐", "科幻游戏"
                ,"悬疑灵异", "竞技同人", "评论文集", "二次元", "脑洞星球"};
        for (String a : arr1){
            novelTypes.add(a);
        }


        Random random=new Random();
        Faker faker = new Faker(Locale.CHINA);//创建JavaFaker对象

        List<String> authors = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<String> types = new ArrayList<>();
        List<String> states = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        List<String> wordNums = new ArrayList<>();
        List<Double> weekRecommends = new ArrayList<>();
        List<Double> recommendAll = new ArrayList<>();
        List<Double> clickNums = new ArrayList<>();


        for (int i = 0 ; i < DataSize ; i++) {
            int a, name, s, t, l1, l2, num;

            //随机生成小说作者名字
            String novelAuthor = faker.name().fullName();
            authors.add(novelAuthor);
//            System.out.println(novelAuthor);

            //随机生成小说名字
            String novelName1 = faker.name().fullName();
            String novelName2 = faker.name().fullName();
            String novelName = novelName1 + novelName2;
            names.add(novelName);
//            System.out.println(novelName);

            //随机生成小说类型
            t = random.nextInt(novelTypes.size());
            String novelType = novelTypes.get(t);
            types.add(novelType);
//            System.out.println(novelType + " " + novelLabel1 + " " + novelLabel2);

            //随机生成小说状态
            String[] novelStates = new String[]{"已完结", "连载中"};
            s = random.nextInt(2);
            String novelState = novelStates[s];
            states.add(novelState);
//            System.out.println(novelState);
            //随机生成字数
            RandomNum randomNum = new RandomNum();
            //
            num = randomNum.getNum(0, 20);
            nums.add(num);

            double novelNum = 0;

            if (i <= DataSize * Words1) {
                novelNum = randomNum.getNum(0, 300000);
            } else if (i <= DataSize * (Words1 + Words2))
                novelNum = randomNum.getNum(300000, 600000);
            else if (i <= DataSize * (Words1 + Words2 + Words3))
                novelNum = randomNum.getNum(600000, 1000000);
            else
                novelNum = randomNum.getNum(1000000, 2000000);
            String novelNums = String.format("%.1f", novelNum / 10000);
            wordNums.add(novelNums);
            //            System.out.println(novelNum);

            //随机生成周推荐数,总推荐数
            double novelWeekRecommend;
            double novelRecommendAllNum;
            do {
                novelWeekRecommend = randomNum.getNum(0, (int) WeekRecommend_up);
                novelRecommendAllNum = randomNum.getNum(0, (int) Recommend_up);
            } while (novelWeekRecommend > novelRecommendAllNum);
            weekRecommends.add(novelWeekRecommend);
            recommendAll.add(novelRecommendAllNum);
//            System.out.println(novelWeekRecommend);
//            System.out.println(novelRecommendAllNum);

            //随机生成总点击数
            double novelClickNum = randomNum.getNum(0, (int) Click_up);
            clickNums.add(novelClickNum);
//            System.out.println(novelClickNum);
        }

        String writeFile = "D:\\专综2data\\data.csv";
        try (BufferedWriter writeText = new BufferedWriter(new FileWriter(writeFile, false))) {
            //第二步：通过BufferedReader类创建一个使用默认大小输出缓冲区的缓冲字符输出流
            //第三步：将文档的下一行数据赋值给lineData，并判断是否为空，若不为空则输出2
            //换行
            //调用write的方法将字符串写到流中
            for(int i=0;i<DataSize;i++){
                writeText.write(names.get(i) + ","
                        + authors.get(i) + ","
                        + nums.get(i) + ","
                        + types.get(i) + ","
                        + states.get(i)+ ","
                        + wordNums.get(i) + ","
                        + recommendAll.get(i) + ","
                        + weekRecommends.get(i) + ","
                        + clickNums.get(i));
                writeText.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        number++;
        return "成功";
    }
}
