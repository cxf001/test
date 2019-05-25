package homework;

import java.util.Random;

/*
获取一个1-100之间(包含1和100)的随机数n，求2~n之间（包含2和n）偶数的个数，并打印到控制台上
* */
public class Test03 {
    public static void main(String[] args) {
        Random r=new Random();
        int number=r.nextInt(100) + 1;
        int count=0;
        for (int i = 2; i <= number; i++) {
            if(i%2==0){
                count++;
            }
        }
        System.out.println("count:" + count);
    }
}
