/*
当final关键字用来修饰一个方法的时候，这个方法就是最终方法，也就是没有儿子不能覆盖重写
格式：
修饰符 final 返回值类型 方法名称(参数列表){
方法体
}
注意事项：
对于类，方法来说，abstract关键字不能同时使用因为矛盾
abstract是抽象方法 要覆盖重写

* */public class A3Fu {//这里加了final子类就会报错
    public void method(){
        System.out.println("父类方法执行");
    }
}
