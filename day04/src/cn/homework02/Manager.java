package cn.homework02;
/*1.项目经理类Manager
        属性：
        姓名name
        工号id
        工资salary
        奖金bonus
        行为：
        工作work()
       */
public class Manager {
    private String name;
    private int id;
    private int salary;
    private int bonus;
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
    public int getBonus() {
        return bonus;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public Manager() {
    }
    public Manager(String name, int id, int salary, int bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }
    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"奖金为"+bonus+"的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}
