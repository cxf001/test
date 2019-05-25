package cn.homework02;

import java.util.Random;

/*(1)定义一个长度为6的int类型数组，元素值使用随机数生成（范围为50-80）
            (2)求出该数组中满足要求的元素和。
            要求：求和的元素的个位和十位不能包含7,并且只能为偶数。*/
public class Test06 {
        public static void main(String[] args) {
            int[] arr=new int[6];
            Random r=new Random();
            int sum=0;
            for (int i = 0; i < arr.length; i++) {
                arr[i]=r.nextInt(31)+50;
                if(arr[i]%10!=7&&arr[i]/10%10!=7&&arr[i]%2==0){
                    sum+=arr[i];
                }
            }
            System.out.println("sum:" + sum);
        }
}
