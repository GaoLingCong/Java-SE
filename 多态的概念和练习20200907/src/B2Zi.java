public class B2Zi extends B1Fu {

    //@Override  错误写法
    int num = 20 ;
    int age = 16;

    @Override
    public void shounum() {
        System.out.println(num);
    }
    @Override
    public void method(){
        System.out.println("父类方法");
    }
    public void  methodzi(){
        System.out.println("子类特有方法");
    }
}
