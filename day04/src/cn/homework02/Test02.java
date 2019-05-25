package cn.homework02;

public class Test02 {
    public static void main(String[] args) {
        int[] arr={1,2,35,77,99,102};
        int max=getMax(arr);
        System.out.println("max:" + max);
    }
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
