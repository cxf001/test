package homework;

import java.util.Scanner;

/*1.定义方法public static boolean isSXH(int num)，
        功能:判断数字num是否是水仙花数,如果是返回true,如果不是返回false。
        2.在main方法中调用该方法，传入数字，打印结果。(所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。)
        打印：传入数字153，结果为true，该数字是水仙花数。*/
public class Test02 {
    public static void main(String[] args) {
        boolean a=isSXH(153);
        System.out.println(a);
    }
    public static boolean isSXH(int a){
        int ge=a%10;
        int shi=a/10%10;
        int bai=a/10/10%10;
        if(a==ge*ge*ge+shi*shi*shi+bai*bai*bai){
            return true;
        }else{
            return false;
        }
    }
}
