public interface B4接口 {
    public  abstract  void methodB();
    public  abstract  void methodC();
    public default void A()
    {
        System.out.println("默认方法B");
    }



}
