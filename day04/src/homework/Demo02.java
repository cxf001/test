package homework;

import java.util.Scanner;

/*
判断字符串长度，若用户输入的字符串长度小于10，则提示输入不合法，并结束程序；
若字符串长度合法，取出字符串中索引3-9位置上的字符（包含3和9），
统计截取后新的字符串中字母的个数（大写字母和小写字母都算）
，将统计出来的结果打印到控制台上
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line=sc.nextLine();
        if(line.length()<=10){
            System.out.println("输入不合法！");
        }

    }
}
