public class TextGenericClass {
    public static void main(String[] args) {
        //不写泛型默认为Object类型
        GenericClass GenericClass = new GenericClass();
        GenericClass.setA("字符");
        Object obj = GenericClass.getA();

        //创建GenericClass对象,泛型使用Integer类型
        GenericClass<Integer> gc1 = new GenericClass<>();
        gc1.setA(1);

        Integer name = gc1.getA();
        System.out.println(name);

        //创建GenericClass对象,泛型使用String类型
        GenericClass<String> gc2 = new GenericClass<>();
        gc2.setA("小明");
        String name1 = gc2.getA();
        System.out.println(name1);


//        总结一个类分别接收不同的结果 字符和整型
//        用String 和 Integer 创建泛型的对象
    }
}
