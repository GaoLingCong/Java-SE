public interface B2接口 {
    public abstract  void  methodA();
    public  abstract  void methodC();//加abstract  抽象方法
    public default void A()
    {
        System.out.println("默认方法A");
    }
}
