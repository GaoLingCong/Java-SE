public class TextGenericINterface {
    /*
     * 测试含有泛型的接口*/
    public static void main(String[] args) {
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("字符串");
        gi1.method("55");

        //创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(10);

        GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2<>();
        gi3.method(2.22);

    }

}
