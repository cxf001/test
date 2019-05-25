package cn.homework02;
/*(1)定义方法public static boolean isSym(int[] arr)，
判断数组中的元素值是否对称,对称返回true，不对称返回false；
        (2)在main方法中，定义一个数组，并调用方法。
        (3)打印结果：[1,2,3,4,3,2,1]是否对称：true*/
public class Test05 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        boolean result=isSym(arr);
        System.out.println(result);
    }
    public static boolean isSym(int[] arr){
        for (int i = 0,j=arr.length-1; i <=j; i++,j--) {
            if(arr[i]!=arr[j]){
                return false;
            }
        }
        return true;
    }
}
