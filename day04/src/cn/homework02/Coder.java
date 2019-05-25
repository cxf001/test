package cn.homework02;
/* 2.程序员类Coder
         属性：
         姓名name
         工号id
         工资salary
         行为：
         工作work()
         要求:
         1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，setter和getter方法
         2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
         3.调用成员方法,打印格式如下:
         */
public class Coder {
    private String name;
    private int id;
    private int salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Coder() {
    }
    public Coder(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"的程序员正在努力的写着代码......");
    }
}
