public class A3继承父类并实现多个接口 extends Object implements  A2继承父类并实现多个接口A,A2继承父类并实现多个接口B{
 //来源于两个接口的方法都要覆盖重写
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodABS() {
        System.out.println("覆盖重写了ABS接口的所有抽象方法"
        );
    }

    @Override
    public void methodC() {
        System.out.println("对多个接口当中冲突的默认方法进行覆盖重写");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了A方法");

    }
}

