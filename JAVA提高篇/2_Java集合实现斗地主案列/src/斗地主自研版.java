/*


斗地主案例
一.准备牌阶段
1.准备两张特殊牌 大王 小王
2.准备四个花色      ♠ ♥ ♣ ◆
3.准备13张牌号 A，1，2，3，4，5，6，7，8，9，10，J，Q，K，
4.花色和牌号和特殊牌组合
二.洗牌
1.使用sun把所以牌装再一起
2.再用 Collections.shuffle(sum);把牌打乱
三.发牌
1.先取出三个牌
2.每人发17
3.抢地主那个再把前面三个牌给他

*/



import java.util.ArrayList;

public class 斗地主自研版 {
    public static void main(String[] args) {
        ArrayList<String> paihao = new ArrayList<>();//存牌号
        ArrayList<String> haose  = new ArrayList<>();//存花色
        ArrayList<String> sum    = new ArrayList<>();//存总牌数

        斗地主自研版的类 is = new 斗地主自研版的类();

        is.prepare(paihao,haose,sum);
        is.Shffle(sum);

        ArrayList<String> Player1  = new ArrayList<>();
        ArrayList<String> Player2  = new ArrayList<>();
        ArrayList<String> Player3  = new ArrayList<>();

       is.Deal(sum);


    }


}
