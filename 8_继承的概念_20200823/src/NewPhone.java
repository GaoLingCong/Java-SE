//定义一个新手机，使用老手机作为父类
public class NewPhone  extends Phone{
    @Override
    public void show() {
        super.show();//把父类的show方法拿过来重复利用
        //自己子类添加更多内容
       // System.out.println("显示号码");//重复
        System.out.println("显示头像");
        System.out.println("显示名字");
    }
}
