public class Zi1 extends Fu1 {
    int num =20;
    @Override//覆盖重写判断
    public void  method(){
        super.method();//调用父类的方法
        System.out.println("子类方法");
    }
    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);

    }

}
