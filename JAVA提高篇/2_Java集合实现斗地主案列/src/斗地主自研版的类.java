import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class 斗地主自研版的类 {

   private  ArrayList haose;
    private ArrayList paihao;
    private ArrayList sum;
    private ArrayList Player1;
    private ArrayList Player2;
    private ArrayList Player3;

    //准备牌
    public  void prepare(ArrayList<String> haose,ArrayList<String> paihao,ArrayList<String> sum)
    {
        haose.add("♠");
        haose.add("♥");
        haose.add("♣");
        haose.add("◆");
        paihao.add("A");
        paihao.add("2");
        paihao.add("3");
        paihao.add("4");
        paihao.add("5");
        paihao.add("6");
        paihao.add("7");
        paihao.add("8");
        paihao.add("9");
        paihao.add("10");
        paihao.add("J");
        paihao.add("Q");
        paihao.add("K");

        for (int i = 0; i <paihao.size(); i++) {
            String s1 = (String) paihao.get(i);
            for (int j = 0 ;j<haose.size();j++)
            {
                String s2 = (String) haose.get(j);
                sum.add(s2+s1);
            }
        }
        sum.add("大王");
        sum.add("小王");
    }

    //洗牌

    public void Shffle(ArrayList sum)
    {
        System.out.println("扑克牌洗完牌后总牌");
        Collections.shuffle(sum);
        System.out.println(sum);
        System.out.println("*****************分界线**********************");

    }

    //发牌ArrayList A,ArrayList B,ArrayList C

    public void Deal(ArrayList sum)
    {
        ArrayList<String> Player1  = new ArrayList<>();
        ArrayList<String> Player2  = new ArrayList<>();
        ArrayList<String> Player3  = new ArrayList<>();
        Random random = new Random();//产生随机数
        int a = random.nextInt(3)+1;//随机数控制范围 1，2，3
        System.out.println("这局地主为"+a+"号玩家");
        if(a==1)
        {
            for (int i = 34; i < 54; i++) {
                String s = (String) sum.get(i);
                Player1.add(s);
            }
            for (int i = 0; i <17; i++) {
                String s = (String) sum.get(i);
                Player2.add(s);
            }
            for (int i = 17; i < 34; i++) {
                String s = (String) sum.get(i);
                Player3.add(s);
            }

        }

        if(a==2)
            {

             for (int i = 34; i < 54; i++) {
                String s = (String) sum.get(i);
                Player2.add(s);
                }

             for (int i = 0; i <17; i++) {
                 String s = (String) sum.get(i);
                 Player1.add(s);
                }


                for (int i = 17; i < 34; i++) {
                    String s = (String) sum.get(i);
                    Player3.add(s);
                }

            }

         if(a==3)
         {
             for (int i = 34; i < 54; i++) {
                 String s = (String) sum.get(i);
                 Player3.add(s);
             }

             for (int i = 17; i < 34; i++) {
                 String s = (String) sum.get(i);
                 Player2.add(s);
             }

             for (int i = 0; i < 17; i++) {
                 String s = (String) sum.get(i);
                 Player1.add(s);
             }
         }


        System.out.println("1号玩家"+Player1);
        System.out.println("2号玩家"+Player2);
        System.out.println("3号玩家"+Player3);


    }


    }

