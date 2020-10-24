public class Money {
    private int yuan;
    private int jiao;
    private int fen;

    public void decimalism()//满10进1
    {
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
        System.out.println("这个Money数是：");
        System.out.println(yuan+"元"+jiao+"角"+fen+"分");
    }



    public void add(Money m2)
{
    this.yuan += m2.getYuan();
    this.fen  += m2.getFen();
    this.jiao += m2.getJiao();

}
    public void subtraction(Money m2)
    {
        this.yuan -= m2.getYuan();
        this.fen  -= m2.getFen();
        this.jiao -= m2.getJiao();

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


public static class Utilse {
        public static int add(int a1,int a2){
            return a1+a2;
        }
}


}
