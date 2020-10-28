import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DouDiZhuPRO {
    private ArrayList sum;
    ArrayList<String> Player1 = new ArrayList<>();//玩家1
    ArrayList<String> Player2 = new ArrayList<>();//玩家2
    ArrayList<String> Player3 = new ArrayList<>();//玩家3
    ArrayList<String> Dipai = new ArrayList<>();//地主牌

    //1.准备牌
    public  void prepare(ArrayList sum)
    {
        //定义两个数组存花色和牌数
        String[] colors =  {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        //增强for循环嵌套遍历两个数组,组装52张牌
        for (String color : colors) {
            for (String number : numbers) {
                sum.add(color+number);
            }
        }

        //添加大王小王到集合当中
        sum.add("大王");
        sum.add("小王");
    }


       //       2.洗牌
    public void Shffle(ArrayList sum)
    {
        //使用集合的工具类Collections中的方法
        //static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换。
        Collections.shuffle(sum);
    }


      //        3.发牌

    public void Deal(ArrayList sum) {

        Random random = new Random();//产生随机数
        int a = random.nextInt(3) + 1;//控制随机数范围为 1，2，3
        System.out.println("本局地主为" + a + "号玩家");//选出地主

        for (int i = 0; i < sum.size(); i++) {
            //获取每一张牌
            String p = (String) sum.get(i);
            //轮流发牌
            if (i >= 51) {
            //给地主牌发牌
                Dipai.add(p);
            }
            //因为i%3有三种结果就可以一张一张的给玩家发牌
            else if (i % 3 == 0) {
             //给玩家1发牌
                Player1.add(p);
            } else if (i % 3 == 1) {
             //给玩家2发牌
                Player2.add(p);
            } else if (i % 3 == 2) {
             //给玩家3发牌
                Player3.add(p);
            }
        }

        //判断地主是谁然后把地主牌给他
        if(a==1)
        {   //使用Collections.addAll方法 把集合Player1里面分别添加集合dipai里面的1,2,3元素
            Collections.addAll(Player1, Dipai.get(0), Dipai.get(1), Dipai.get(2));
        }
        if(a==2)
        {

            Collections.addAll(Player2, Dipai.get(0), Dipai.get(1), Dipai.get(2));
        }
        if(a==3)
        {
            Collections.addAll(Player3, Dipai.get(0), Dipai.get(1), Dipai.get(2));
        }


    }

    //4.看牌
    public void show() {
        System.out.println("1号玩家" +Player1);
        System.out.println("2号玩家" + Player2);
        System.out.println("3号玩家" + Player3);
        System.out.println("地主牌为"+ Dipai);
    }
    }

