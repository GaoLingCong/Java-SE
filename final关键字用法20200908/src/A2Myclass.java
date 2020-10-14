/*
* 当final关键字用来修饰一个类的时候，格式
* public final class 类名称 {
*
* }
* 含义：当前这个类不能有任何子类（太监类）可以有父类，不能有子类继承不然会报错
* 注意：一个类如果用final的，那么其中的所以成员方法都无法进行覆盖重写（因为你是太监 没有儿子哈哈没人继承）
* */
public final class  A2Myclass  /*extends Odject*/{
    public void method(){
        System.out.println("方法执行");
    }

}
