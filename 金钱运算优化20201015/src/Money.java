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

        public Money add(Money m2)
        {
            this.yuan += m2.getYuan();
            this.fen  += m2.getFen();
            this.jiao += m2.getJiao();

            return m2;
        }
        public void subtraction(Money m2)
        {
            this.yuan -= m2.getYuan();
            this.yuan -= m2.getFen();
            this.yuan -= m2.getFen();

        }

        public   void Double(Money m2,int X)
    {
        int n = 0;
        this.yuan=this.yuan*n;
        this.yuan=this.jiao*n;
        this.yuan=this.fen*n;

    }
    public void compare(Money a,Money b)
    {
        Money c = null;
        Money d = null;
if(c.yuan>d.jiao)
{
    System.out.println("钱数A比较大");
}

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




    }


