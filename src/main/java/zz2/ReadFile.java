package zz2;

import com.github.javafaker.Book;
import com.github.javafaker.Faker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
//        try {
//            Scanner scanner = new Scanner(new File("D:\\刘博文\\大三下\\专业综合应用1\\scalaStudy\\scala_3_2022\\src\\main\\java\\zz2\\Data\\小说作品名字.txt"));
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
//            scanner.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        Faker faker = new Faker(Locale.CHINA);//创建JavaFaker对象

        String name = faker.name().fullName();
        String bookName = faker.bothify("123");
        Book book=faker.book();
        
        System.out.println(name+"\n" +bookName);
        System.out.println(book.title()+"\n"+book.author()+"\n");
    }

}