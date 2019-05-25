package cn.homework02;
 /*2.定义测试类,在main方法中创建该类的对象并给属性赋值
 (演示两种方法:setter方法和构造方法)
         3.调用三个成员方法,打印格式如下:
         正在使用价格为998元的小米品牌的手机打电话....
         正在使用价格为998元的小米品牌的手机发短信....
         正在使用价格为998元的小米品牌的手机玩游戏...*/
public class PhoneDemo {
     public static void main(String[] args) {
         Phone p=new Phone();
         p.setBrand("小米");
         p.setPrice(998);
         p.call();
         p.sendMessage();
         p.playGame();

         Phone p2=new Phone("小米",998);
         p2.call();
         p2.sendMessage();
         p2.playGame();
     }
}
