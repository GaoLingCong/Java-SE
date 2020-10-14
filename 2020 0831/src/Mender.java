import java.util.ArrayList;
import java.util.Random;
//普通成员

public class Mender  extends User {
    public Mender() {

    }

    public Mender(String name, int money) {
        super(name, money);
    }
      public void receive(ArrayList<Integer> list){
        //从多个红包当中随便取一个给自己
          //随机获取一个集合当中的一个索取值
          int index =  new Random().nextInt(list.size());//随机数
          //从集合中删除
          int dalta = list.remove(index);
          //当前成员自己本来有多少钱
          int money = super.getMoney();
          //加法，并且重新设置回去
          super.setMoney(money+dalta);

      }
}
