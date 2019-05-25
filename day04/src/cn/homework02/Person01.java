package cn.homework02;

public class Person01 {
    private String name;
    private int age;
    public void show(){
        System.out.println("我叫：" + name + "，年龄：" + age);
    }
    public void setAge(int num){
        if(num<=100&&num>0)  {
            age=num;
    }else {
            System.out.println("你输入的数据有误！");
        }
    }
    public int getAge(){
        return age;
    }
    public void setName(String name1){
        name=name1;
    }
    public String getName(){
        return name;
    }
}
