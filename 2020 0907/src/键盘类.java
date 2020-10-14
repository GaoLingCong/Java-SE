public class 键盘类 implements USB接口 {
    @Override
    public void 打开设备() {
        System.out.println("打开键盘");
    }

    @Override
    public void 关闭设备() {
        System.out.println("关闭键盘");
    }
    public void type(){
        System.out.println("键盘输入");
    }
}
