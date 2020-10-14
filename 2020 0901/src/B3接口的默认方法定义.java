public class B3接口的默认方法定义 implements  B1接口的默认方法的定义{
    @Override
    public void methobAbs() {
        System.out.println("实现了抽象方法！BBB");
    }
    public void mehodDefault(){
        System.out.println("实现类B2覆盖重写了接口的默认方法");
    }
}
