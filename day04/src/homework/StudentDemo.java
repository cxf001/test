package homework;

import java.util.ArrayList;

/*
创建两个ArrayList集合分别为list和list1
添加3个学生对象到list集合中，分别为：
       姓名 成绩
       张三  99
       李四  66
       王五  77
遍历集合，将list集合中，成绩小于70的学生删掉。
将删除后list集合中的学生对象放入list1集合中，
并且在控制台上打印list1集合中学生的分数平均值
 */
public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        ArrayList<Student> list1=new ArrayList<>();
        Student s1=new Student("张三",99);
        Student s2=new Student("李四",66);
        Student s3=new Student("王五",77);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int sum=0;
        for(int i=0;i<list.size();i++){
            Student s = list.get(i);
            if(s.getScore()<70){
                list.remove(i);
                i--;
            }else{
                list1.add(list.get(i));
                sum+=s.getScore();
            }
        }
        double pvg=sum/list1.size();
        System.out.println("学生的分数平均值为：" + pvg);

    }
}
