public class Test implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        C6001_Rational x = new C6001_Rational(1,2);
        C6001_Rational y = new C6001_Rational(1,3);
        C6001_Rational z = new C6001_Rational(1,6);
        //toStrinf方法
        System.out.println(x.toString());
        //进行比较方法equals方法
        boolean D = x.equals(y);
        System.out.println(D);
        //执行拷贝方法clone
        C6001_Rational h = x.clone();
        h.setNumerator(1);
        h.setDenominator(4);
        C6001_Rational result = x.add(y).add(z).add(h);
        System.out.println("结果为"+result.getInfo());

    }
}
