public class Test implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        var x = new C6001_Rational(1,2);
        var y = new C6001_Rational(1,3);
        var z = new C6001_Rational(1,6);
        //toStrinf方法
        System.out.println("执行toString方法的结果"+x.toString());
        //进行比较方法equals方法
        boolean D = x.equals(y);
        System.out.println("执行equals方法的结果"+D);
        //执行拷贝方法clone
        C6001_Rational h = x.clone();
        h.setNumerator(1);
        h.setDenominator(5);
        C6001_Rational result = x.add(y).add(z).add(h);
        System.out.println("1/2+1/3+1/6+1/5 = "+result.getInfo());

    }
}
