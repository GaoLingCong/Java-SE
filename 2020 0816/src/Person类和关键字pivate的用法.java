/*这是一个类*/

/*问题描述    定义person的年龄是无法阻止不合理数据进行设置
 * 解决方案    用private关键字将需要保护的成员变量进行修饰
 * 格式  private int age;
 * 一旦使用private 本类当中仍然可以随意访问
 * 但是！超出了本类范围之外就不能直接访问
 * 间接访问 private成员变量 就是定义一对Getter / Setter方法
 * 必须交setXxx/  getXxx  命名规则
 * 对于Getter来说 不能有参数，返回值类型和成员变量类型对应
 * 对于Setter来说    不能有返回值，参数类型和成员变量对应
 *
 *  */

public class Person类和关键字pivate的用法 {

     String name;  // 成员属性
      private int age;
     public  void show(){
         System.out.println("我叫："+name+"，年龄"+age);

    }
    //这个成员方法专门向age设置数据
    public void  setAge(int num)//set设置的意思  成员变量首之母大写   有参数 没有返回值
    {
        if(num<100&&num>0)
        {
            age=num;  //往里拿                   就可以对age把关合理性

        }else{
            System.out.println("数据错误");
        }

    }
    //这个成员方法专门获取age的成员数据  没有参数要有返回值
    public int getAge() {    //
         return age;
        //返回值类型必须和age成员变量类型一样
    }
}
