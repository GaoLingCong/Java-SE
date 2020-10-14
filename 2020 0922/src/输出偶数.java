public class 输出偶数 {
    public static void main(String[] args) {
        int square=0;//存放i的平方
        int sum=0;//存放i的平方和
        for (int i = 0; i < 10;i++ ) {
            if(i/2==3)continue;//把6所在循环退出
            if (i % 2 == 0) {
                square=i*i;
                System.out.println(square);
            }
            sum=sum+square;//累加平方和
        }
        System.out.println(sum);
    }
}

