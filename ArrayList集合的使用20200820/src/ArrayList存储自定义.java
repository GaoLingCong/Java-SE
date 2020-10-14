import java.util.ArrayList;

/*
题目：
自定义4个学生对象，添加到集合，并遍历。

思路：
1. 自定义Student学生类，四个部分。
2. 创建一个集合，用来存储学生对象。泛型：<Student>
3. 根据类，创建4个学生对象。
4. 将4个学生对象添加到集合中：add
5. 遍历集合：for、size、get
 */
public class ArrayList存储自定义 {
    public static void main(String[] args) {
        ArrayList<Student> ListA =new ArrayList<>();
        Student stu1 =new Student(20,"高灵聪");
        Student stu2=new Student(16,"迪丽热巴");
        Student stu3=new Student(12,"玛卡巴卡");
        Student stu4=new Student(85,"迪西迪西");
        ListA.add(stu1);
        ListA.add(stu2);
        ListA.add(stu3);
        ListA.add(stu4);
        for (int i = 0; i < ListA.size(); i++) {
            Student stu = ListA.get(i);
            System.out.println("姓名是"+stu.getName()+"年龄是"+stu.getAge());


        }




    }
}
