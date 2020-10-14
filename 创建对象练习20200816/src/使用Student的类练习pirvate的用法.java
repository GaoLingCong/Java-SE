public class 使用Student的类练习pirvate的用法 {
    public static void main(String[] args) {

        Student stu = new Student();//创建对象
        stu.setName("高灵聪");
        stu.setAge(20);//放进去
        stu.setMale(true);
        System.out.println("姓名"+ stu.getName());
        System.out.println("年龄"+ stu.getAge());  //拿出来
        System.out.println("是不是男的"+ stu.isMale());


    }

}
