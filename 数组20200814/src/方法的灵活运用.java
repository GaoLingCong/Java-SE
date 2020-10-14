/*
方法其实就是若干语句的集合
蒙牛工厂
参数：奶牛 饲养物 加工  // 就是进入方法的数据
返回值：奶制品         //就是从方法出来的数据

定义方法的完整格式
修饰符 返回值类型 方法名称（参数类型 参数名称，。。。。）
{
方法体
ruturn 返回值;
}

修饰符 ： 现阶段 public static
返回值类型：就是方法最终产出数据结果的类型
方法名称 ：规则和变量一样小驼峰
参数类型：进入方法的数据类型
参数名称：进入方法的数据对应变量的名称
参数多个用，分割
方法体：方法需要做的事情，代码
return ： 两个作用 第一停止当前方法，第二讲后面的返回值还给调用
返回值：也就是方法执行后最终产生的数据结果

注意事项
return后面的“返回值”必须和方法名称前面的“返回值类型”保持对应


定义一个两个int数字相加的方法 三要素
返回值类型 int
方法名称  sum
参数列表 int a，int b
方法的三种调用格式
单独调用  方法名称（参数）
打印调用  System.out.println(方法名称（参数）);

赋值调用  数据类型 变量名称 = 方法名称 （参数）

此前学习的方法，返回值类型固定写void，这种方法只能单独调用，不能打印赋值调用
*/

public class 方法的灵活运用 {
    public static void main(String[] args) {
        sum(10,20);//单独调用
        System.out.println(sum(10,20));//打印调用
        System.out.println("++++++++++++++++++++++++");
        int number = sum(15,25);//赋值调用
        number +=100;
        System.out.println("变量的值："+number);


    }

    public static int sum (int a,int b)
    {
        int result = a+b;
        return result;//类型要一样
    }
    }

