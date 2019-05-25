package homework;

import java.util.Scanner;

/*根据输入的消费金额，输出对应的折扣，并根据折扣在控制台输出对应折扣后的金额，折扣的范围如下（P代表消费的金额）（8分）
        P>=2000 7折，1000<=P<2000 8折，500<=P<1000 9.5折，P<500 不打折*/
public class Test04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入消费金额：");
        int p=sc.nextInt();
        if(p>=2000){
            System.out.println("折扣7折，打折前金额：" + p+",打折后金额：" + p*0.7);
        }else if(p>=1000&&p<2000){
            System.out.println("折扣7折，打折前金额：" + p+",打折后金额：" + p*0.8);
        }else if(p>=500&&p<1000){
            System.out.println("折扣7折，打折前金额：" + p+",打折后金额：" + p*0.95);
        }else {
            System.out.println("不打折，金额：" + p);
        }
    }
}
