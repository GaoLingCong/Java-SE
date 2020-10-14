public class Computer {  //ctrl+alt+L对齐

    public void poweron() {
        System.out.println("笔记本电脑开机");
    }

    public void poweroff() {
        System.out.println("笔记本电脑关机");
    }
    //使用USB设备的方法,使用接口作为方法的参数
    public void 使用设备(USB接口 usb接口)
    {
        usb接口.打开设备();
        if(usb接口 instanceof  鼠标类)
        {
            鼠标类 鼠标 = (鼠标类) usb接口;//向下转型
            鼠标.click();
        }
        if(usb接口 instanceof  键盘类)
        {
             键盘类 键盘 = (键盘类) usb接口;//向下转型
            键盘.type();
        }


        usb接口.关闭设备();
    }
}
