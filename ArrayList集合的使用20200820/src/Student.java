/*
* 复习一遍标准的类四要素*/
public class Student {
    private int age;   //1  private修饰
    private String name;

    public Student() {  //无参构造方法

    }

    public Student(int age, String name) {  //有参构造方法
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {  //set/get
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
