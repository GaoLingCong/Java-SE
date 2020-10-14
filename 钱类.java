public class 钱类 {
    private int yuan;
    private int jiao;
    private int fen;

    public void decimalism(int a,int b,int c)//满10进1
    {
        fen = c;
        jiao = b;
        yuan = a;
if(fen>=10) {
        jiao=jiao+ (fen / 10);//因为int是整型所以小数点省略可以取整
       fen = (fen % 10);//个位数
}
if(jiao>=10) {
        yuan=yuan+(jiao/10);
        jiao=(jiao%10);
    }
}

    public void methodshow()
    {
        System.out.println("这个钱数是：");
        System.out.println(yuan+"元"+jiao+"角"+fen+"分");
    }

public int add(int a1,int a2)
{
    int a= a1+a2;

   return a;
}

    public int getYuan() {
        return yuan;
    }

    public int setYuan(int yuan) {
        this.yuan = yuan;
        return yuan;
    }

    public int getJiao() {
        return jiao;
    }

    public int setJiao(int jiao) {
        this.jiao = jiao;
        return jiao;
    }

    public int getFen() {
        return fen;
    }

    public int setFen(int fen) {
        this.fen = fen;
        return fen;
    }


    //    public int add(int x,int y)//加法
//    {
//        int sum ;
//        sum=x+y;
//        return sum;
//    }
//    public int aubtraction(int x,int y)//减法
//    {
//        int sum;
//        sum=x-y;
//        return sum;
//    }
//    public  int dubleA(int x,int n)
//    {
//        int sum ;
//        sum=x*n;
//        return sum;
//    }
//    public  int dubleB(int x,int n)
//    {
//        int sum ;
//        sum=x*n;
//        return sum;
//    }
//    public int compare(int x,int y)
//    {
//        int result;
//        result= (x>y?x:y);
//            return result;
//    }



    public 钱类() {

    }








}
