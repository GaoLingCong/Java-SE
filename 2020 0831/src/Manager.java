import java.util.ArrayList;
//群主的类
public class Manager extends User {


    public Manager() {
        //super();
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send (int totalMoner, int count) {
        //首先需要一个集合，用来存储红包金额
        ArrayList<Integer> redList = new ArrayList<>();//创建一个集合
        //看群主有多少钱
        int leftMoner = super.getMoney();//群主当前余额
        if(totalMoner>leftMoner)//红包金额大于余额
        {
            System.out.println("余额不足");
            return redList;
        }

        //扣钱
        super.setMoney(leftMoner-totalMoner);
        //发红包需要平均拆分成count份
        int avg = totalMoner/count;
        int mod = totalMoner%count;//余数剩下的零头
        //除不开的红包放最后一个包里
        //把下面红包一个个放在集合当中
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);

        }
        //最后一个红包
        int last  = avg + mod;
        redList.add(last);
        return redList;
    }
}
