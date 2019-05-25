package homework;

import java.util.Random;

/*
按照以下要求，完成操作：(10分)
        a. 随机生成8个1-20之间的偶数，存放到合适的集合中；
                PS: 范围包括1和20
        b. 计算出这些随机数的平均值并输出; 
        c. 将小于平均值的数字从集合中删除；
 */
public class Test05 {
    public static void main(String[] args) {
        Random r=new Random();
        int[] arr=new int[8];
        int count=0;
        int sum=0;
        while(true) {
            int number = r.nextInt(20)+1;
            if(number%2==0){
                count++;
                arr[count - 1] = number;
            }
           if(count==8){
               break;
           }
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double avg=sum/arr.length;
        System.out.println("avg:" + avg);
    }
}
