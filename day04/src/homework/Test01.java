package homework;

import java.util.Arrays;

/*
第六题(扩展题！！！)：
        有以下数组：
        int[] arr = {2,1,5,4,10,18,9,7};

        请通过程序，把数组中的元素从小到大进行排序。
        最终要求 arr中存储的数据的顺序为：
        {1,2,4,5,7,9,10,18};
*/

public class Test01 {
    public static void main(String[] args) {
        int[] arr={2,1,5,4,10,18,9,7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(Arrays.toString(arr));

    }
}

/*
public class Test01{
    public static void main(String[] args) {
        char[] ch=new char[1];

        char c1=ch[0];
        System.out.println(c1);
    }
}*/
