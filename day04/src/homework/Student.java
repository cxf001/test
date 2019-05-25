package homework;
/*
6.创建一个学生类，包含两个私有属性：姓名（name）和成绩（score），
（name的类型为String类型，score的类型为int类型）
并提供无参和有参构造，get/set方法（12分）

 */
public class Student {
     private String name;
     private int score;

    public Student() {
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
