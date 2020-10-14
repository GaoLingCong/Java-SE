public class 用Person这个类创建对象 {
    /*问题描述    定义person的年龄是无法阻止不合理数据进行设置
    * 解决方案    用private关键字将需要保护的成员变量进行修饰
    * 格式  private int age;
    *  */




    public static void main(String[] args) {
        Person类和关键字pivate的用法  person = new Person类和关键字pivate的用法 ();//创建person对象
        person.show();//调用类里面的方法
//        因为没有赋值所以自动默认
//        String null
          //person.age=20; //赋值//直接访问person 是错误写法
        person.setAge(20);  //20交给了对面的num
          person.name="高灵聪";//赋值
         person.show();



    }
}
