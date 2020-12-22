

/*

     太棒了什么都可以接收！学以致用！！！！
    定义含有泛型的方法:泛型定义在方法的修饰符和返回值类型之间

    格式:
        修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)){
            方法体;
        }

    含有泛型的方法,在调用方法的时候确定泛型的数据类型
    传递什么类型的参数,泛型就是什么类型



 */
//TextGenericMethod 英文为 测试泛型方法
public class 使用泛型的方法 {
    public static void main(String[] args) {
        //使用泛型方法，参数传什么就变成什么类型
        TextGenericMethod TGM = new TextGenericMethod();
        TGM.method(10);
        TGM.method(0.10);
        TGM.method(10.35849846565);
        TGM.method(10.358984444894);
        TGM.method("666");

        TGM.method02("静态方法，不建议创建对象使用");
        //使用泛型静态方法
        //静态方法，通过类名.方法名(参数)可以直接使用
        TextGenericMethod.method02("这是一个静态方法");
        TextGenericMethod.method02(101010);

    }
}
