/*
* java断言具有保护能力的程序
* 断言机制允许在测试间向代码插入一些检查，而在生产代码中会自动删除这些检查
* 断言语法形式两种
* 1.assert condition (布尔表达式)为 true 继续执行 为false 抛出AssertinErroe 终止程序
* 2.assert condition(布尔表达式):expr冒号后跟着一个表达式，就是通常用于断言失败后的提示信息
* 注意事项 断言的使用要启用和禁用 -enableassertions 或者 - ea 开启断言
*                              -disablessertions 或者 -da 禁用断言
* 断言的副作用 一旦错误就终止系统
* 一般只用于开发测试阶段确定程序内部错误*/


public class 断言的概念 {
    public static void main(String[] args) {
        //例1
        //断言1结果为true，则继续
        assert true;
        System.out.println("没问题");
        System.out.println("**************8");
        //assert false:"断言失败，此表达式将会在抛出异常的时候输出";
        System.out.println("断言2没有问题");
        System.out.println("*******************************");
        //例子2
        int sum = 0;
        int i;
        for ( i = 0; i < 1000; i++) {
            sum+=i;
        }

        assert sum>10&&sum<5*10:"输入范围有错,这个时候就会抛出异常终止系统"+sum;
    }
}
