public class 用标准的类创建对象综合练习 {
    public static void main(String[] args) {

        标准的类 stu1 = new 标准的类();
        stu1.setName("高灵聪");
        stu1.setAge(20);
        System.out.println("姓名"+ stu1.getName()+"年龄"+stu1.getAge());
        System.out.println("================ ");
        标准的类 stu2= new 标准的类("高灵聪",20);
        System.out.println("姓名"+ stu1.getName()+"年龄"+stu1.getAge());
        stu2.setAge(22);
        System.out.println("姓名"+ stu1.getName()+"年龄"+stu1.getAge());

    }

    }


