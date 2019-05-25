package cn.homework02;

/*3.调用成员方法,打印格式如下:
 */
public class CatDog {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        c.setColor("花色");
        c.setBreed("波斯猫");
        d.setColor("黑色");
        d.setBreed("藏獒");
        c.eat();
        c.catchMouse();
        d.eat();
        d.lookHome();
    }
}
