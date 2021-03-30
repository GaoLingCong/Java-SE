package _01_蓝桥杯java本科B组2013年;


/*【题目)
标题:兴中华

小明参加了学校和座味运动会，其中的一个项目是:跳格子。
地上画君一昨格子，经个格子里写一个字，如下所示:(也可参见p1jpa)

坐标
	012345
	1从我做起振
	2我做起振兴
	3做起振兴中
	4起振兴中华

	 变成一棵树


dfs深度搜索
	比赛时，先站在左上角的写看“从”字的格子里，可以横向或纵向跳到相邻的格子里，但不能跳到对角的格子或其它位置。一直要跳到“华”字结束。
	要求跳过的路线刚好构成“从我做起振兴中华”这句话
	请你帮助小明算一算他一共有多少种可能的跳跃路线呢?

答案是一个整数，直接提交该数字。
*/

public class _03振兴中华_递归深度搜索dfs {
    public static void main(String[] arg) {
        int sum = f(0,0);
        System.out.print(sum);



    }
    private static int f(int i,int j) {
        if (i==3||j==4) {
            return 1;

        }
        return f(i+1, j)+f(i, j+1);

    }
}
