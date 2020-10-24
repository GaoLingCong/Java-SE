/*
* 接口当中也可以定义“成员变量”，但是必须使用public static final 三个关键字进行修饰
* 效果看  这就是接口的常量
*
* 格式
* public static final 数据类型 常量名称 =  数据值；
*
* 接口当中的常量可以省略 public static final  注意不写也照样是这样
*接口当中的常量必须要赋值不能不赋值
* 接口中常量的名称必须是 使用完全大写的字母用下划线进行分割 */
public interface A1接口的常量的定义和使用 {
//这就是个常量  一旦赋值  不可以修改
//    public大家都能用的意思   final 修饰 说明不可改变
    public  static  final  int NUM = 10;//shift+f6

}
