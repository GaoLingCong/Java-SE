import java.util.ArrayList;

public class DouDiZhu_PRO {
    public static void main(String[] args) {
        ArrayList<String>  sum= new ArrayList<>();//存所有牌号

        DouDiZhuPRO is = new DouDiZhuPRO();
//        1.准备牌
        is.prepare(sum);
//        2.洗牌
        is.Shffle(sum);
//        3.发牌
        is.Deal(sum);
//        4.看牌
        is.show();
    }
}
/*

总结

缺点:
自研版代码重复太多
创造太多集合

思路
    斗地主综合案例:
        1.准备牌
        准备一个集合存放所有牌
        准备两个数组分别存取扑克牌的4种花色和13种数值
        进行嵌套组合形成52张牌
        把特殊牌(大王,小王)加到所有牌集合中

        2.洗牌
        使用集合的工具类Collections中的方法使用默认随机源对指定列表进行置换
        3.发牌
        创建4个集合分别存取 玩家1 玩家2 玩家3 地主牌
        总牌数先取三张放到地主牌中
        依次给玩家发牌
        挑选出地主 把地主牌交给地主玩家
        4.看牌
        输出打印玩家和地主



 */