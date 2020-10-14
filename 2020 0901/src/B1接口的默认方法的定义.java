/*
从Java 8开始，接口里允许定义默认方法。
格式：
public default 返回值类型 方法名称(参数列表) {
    方法体
}

备注：接口当中的默认方法，可以解决接口升级的问题。
 */
public interface B1接口的默认方法的定义 {
    // 这是一个抽象方法
    public abstract  void methobAbs();   //abstract是抽象方法的关键字
    //新添加一个抽象方法
    //public  abstract  void methobAbs2();
    /*因为按照上面的抽象方法的创建新添加一个抽象方法，其他两个实现类要重写覆盖不然会报错！
    * 所以我们要创建一个默认的方法才可以不报错
    * */
    //新添加的方法改成默认的方法
    public default void mehodDefault(){
        System.out.println("这是一个默认方法");
    }
    }

