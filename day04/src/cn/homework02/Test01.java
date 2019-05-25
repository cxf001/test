package cn.homework02;
public class Test01 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 10; i <=100; i++) {
            int ge=i%10;
            int shi=i/10%10;
            if(ge%2==1&&shi%2==1){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("count:" + count);
    }
}
