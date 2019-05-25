package cn.homework02;
/*工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
        工号为135基本工资为10000的程序员正在努力的写着代码......*/
public class ManagerCoder {
    public static void main(String[] args) {
        Manager m=new Manager();
        Coder c=new Coder();
        m.setName("经理");
        c.setName("程序员");
        m.setId(123);
        c.setId(135);
        m.setSalary(15000);
        c.setSalary(10000);
        m.setBonus(6000);
        m.work();
        c.work();

        Manager m2=new Manager("经理",123,15000,6000);
        Coder c2=new Coder("程序员",135,10000);
        m2.work();
        c2.work();
    }
}
