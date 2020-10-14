/*
一个标准的类通常要拥有以下四个组成部分：
1.所以成员变量都要使用private修饰;
2.为每一个成员变量编写一对Getter/Setter方法
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法
5.Getter/Setter快捷键  Alt+lnsert 打开选择Getter and  Setter 然后shift选中
6.构造方法无参/有参 快捷键快捷键   Alt+lnsert 选择 第一个constructor 无参数选择 Select None  有参数shift选中两个 OK
一个这样标准的类也叫JAVA Bean
this，name=name   // 目的就是把当前对象name的属性设置成参数的值
后面的name是参数
this是值当前的对象
 */
public class 标准的类 {
    private String name;
    private  int age;

//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

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

    //快捷键


    public 标准的类() {
    }

    public 标准的类(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //    public 标准的类(){
//        System.out.println("无参数的类");
//    }
//    public 标准的类(String name ,int age)
//    {
//        System.out.println("有参数的类"+name+age);
//    }
}

