package cn.homework02;
/*1.猫类Cat
        属性:
        毛的颜色color
        品种breed
        行为:
        吃饭eat()
        抓老鼠catchMouse()

        要求:
        1.按照以上要求定义Cat类和Dog类,属性要私有,生成空参、有参构造，setter和getter方法
        2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
       花色的波斯猫正在吃鱼.....
        花色的波斯猫正在逮老鼠.... */
public class Cat {
    private String color;
    private String breed;
    public Cat() {
    }
    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void eat(){
        System.out.println(color+"的"+breed+"正在吃鱼.....");
    }
    public void catchMouse(){
        System.out.println(color+"的"+breed+"正在逮老鼠....");
    }
}
