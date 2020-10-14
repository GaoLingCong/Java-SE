/*一共有四个方法
* methodA methodB methodC method */
public interface B3接口 extends B2接口,B4接口 {
    public abstract  void  methodD();//加abstract  抽象方法

    @Override
    default void A() {

    }
}
