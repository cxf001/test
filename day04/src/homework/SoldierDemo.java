package homework;

import java.util.ArrayList;

/*
定义类：Test,类中定义main()方法，按以下要求编写代码:
分别实例化三个Soldier对象，三个对象分别为："王小兵" ,25,”打篮球”、 "李团长" ,35,”游泳”、"王军长" ,55,”踢足球”;
创建一个ArrayList集合，这个集合里面存储的是Solider类型，分别将上面的三个Solider对象添加到集合中.
遍历这个集合，在遍历的过程中，如果这个集合里面中有对象的年龄大于40，
那么将集合中这个对象的爱好改成”打高尔夫”，
然后调用这个对象的show方法展示这个对象所有的属性信息.
 */
public class SoldierDemo {
    public static void main(String[] args) {
        Soldier s1=new Soldier("王小兵",25,"打篮球");
        Soldier s2=new Soldier("李团长",35,"游泳");
        Soldier s3=new Soldier("王军长",55,"踢足球");
        ArrayList<Soldier> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for(int i=0;i<list.size();i++){
            Soldier s = list.get(i);
            if(s.getAge()>40){
                s.setLike("打高尔夫");
                s.show();
            }
        }
    }
}
