public class 使用构造方法 {


    public static void main(String[] args) {
        Student构造方法举例 stu1 = new Student构造方法举例(); // 无参构造  //创建对象
        System.out.println("============");

        Student构造方法举例 stu2 = new Student构造方法举例("高灵聪",20); // 全参构造
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        // 如果需要改变对象当中的成员变量数据内容，仍然还需要使用setXxx方法
        stu2.setAge(21); // 改变年龄
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());

    }
}



