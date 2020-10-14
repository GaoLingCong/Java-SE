import java.util.ArrayList;

public class 主函数2 {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Mender one = new Mender("成员A",0);
        Mender two = new Mender("成员B",0);
        Mender three = new Mender("成员C",0);
        manager.show();//显示姓名和余额
        one.show();
        two.show();
        three.show();
        System.out.println("========================");
        ArrayList<Integer> redList = manager.send(50,3);
        //三个普通成员取收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        one.show();
        two.show();
        three.show();
        System.out.println("========================");


    }
}
