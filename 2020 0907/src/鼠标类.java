
public class 鼠标类 implements USB接口{
    @Override
    public void 打开设备() {
        System.out.println("打开鼠标");
    }

    @Override
    public void 关闭设备() {
        System.out.println("关闭鼠标");
    }
public void click(){
    System.out.println("鼠标点击");
}
}
