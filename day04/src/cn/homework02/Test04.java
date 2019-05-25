package cn.homework02;

public class Test04 {
    public static void main(String[] args) {
        //主方法中测试
        int[] arr1 = {2, 3, 4, 5, 6};
        int[] arr2 = new int[arr1.length];

        //调用方法，把arr1中的内容复制到arr2数组中
        getCopy(arr1, arr2);

        //遍历打印arr2的元素
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }

    /*
        定义一个方法：
            接收两个数组 int[] arr1,int arr2;
            把 arr1中的内容复制到arr2中；
     */
    public static void getCopy(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }
}