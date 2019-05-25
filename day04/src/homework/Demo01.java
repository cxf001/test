package homework;

import java.util.Scanner;

/*
   ADGdadfFSAFDDS324dfa1232da3daA （test.txt文件和文件中的数据可以手动创建和录入，无需由程序生成）
编写程序，获取Test05.txt文件中内容，统计读取的内容中是字母的个数（大写字母和小写字母都要统计），
并将获取的结果在控制台打印输出
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
                bigCount++;
            } else if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
                smallCount++;
            } else if (line.charAt(i) >= '0' && line.charAt(i) <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字母：" + bigCount + "个");
        System.out.println("小写字母：" + smallCount + "个");
        System.out.println("数字：" + numberCount + "个");
    }
}

