//除了前面两项 后面等于前两项之和
public class 斐波那契数列 {
    public static void main(String[] args) {

        System.out.println("第8为："+fs1(8));
        System.out.println("第8为："+fs2(7));

    }
    //方法一
    public static int  fs1(int n){


        int a,b;
        a=b=1;
        for (int i=3;i<n;i++)
        {
            int t = a;
            a=b;
            b=t+a;
        }
        return b;
    }
//    方法2
    public static int fs2(int n){
        int [] ags = new int[n];
        ags[0]=ags[1]=1;
        for (int i=2;i<n;i++)
        {
            ags[i]=ags[i-1]+ags[i-2];
        }
        return ags[n-1];

    }

}
