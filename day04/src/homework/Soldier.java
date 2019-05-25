package homework;
/*
定义"军人"类,Soldier,包含以下成员:
成员属性: name (姓名) :String类型，age (年龄):int类型,，like (爱好):String类型，属性使用private修饰。
成员方法:
	get/set方法
	show()方法,打印对象所有属性的值;
 */
public class Soldier {
    private String name;
    private int age;
    private String like;

    public Soldier(String name, int age, String like) {
        this.name = name;
        this.age = age;
        this.like = like;
    }

    public Soldier(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
    public void show(){
        System.out.println(name+","+age+","+like);
    }
}