public class 接口内容小结 {
    /* 1.成员变量其实就是常量 格式
    * [public] [static] [final]  数据类型 常量名称 =  数据值
    * 注意
    * 常量必须进行赋值  而且一旦赋值不能改变
    * 常量名称完全大写 用下划线进行分割
    * 2.接口当中最重要的就是抽象方法 ，格式
    * [public] [abstrtact] 返回值类型 方法名称（参数列表）;
    * 注意：实现类必须覆盖重写所有的抽象方法，除非实现类是抽象类
    * 3.从java8 开始  接口允许 定义默认方法 格式：
    * [public] default 返回值类型 方法名称（参数列表）{方法体}
    *
    * 注意：默认方法也可以被覆盖重写
    * 4.从java8开始 接口里允许定义静态方法格式
    * [public] static 返回值类型 方法名称 （参数列表）{方法体}
    * 应该通过接口名称进行调用  不能通过实现类对象调用接口静态方法
    * 5.接口允许定义很对私有方法  格式
    * 普通私有方法  private 返回值类型 方法名称 （参数列表）{方法体}*/
//    * //静态私有方法  private static 返回值类型 方法名称 （参数列表）{方法体}
    //注意private 的方法只有接口自己才能调用  不能被实现类使用或者别人使用 */
}
