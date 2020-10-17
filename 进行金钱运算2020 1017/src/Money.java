public class Money {
    private float a;

    public Money() {

    }


    //加法
    public float method1(double a, double b)
    {
        return (float) (a+b);
    }

    //减法
    public float method2(double a, double b)
    {
        return (float) (a-b);
    }
    //乘法

    public float method3(float B)
    {
        this.a=this.a*B;
        return this.a;
    }

    //比较大小
    public void method4(double a, double b)
    {
        if(a>b)
        {
            System.out.println("钱数A比较大");
        }else{
            System.out.println("钱数B比较大");
        }
    }


  public void merhod5()
  {
      this.a*=100;
      int e = (int)(this.a/1000);//千位
      int a = (int) (this.a/100%10);//百位
      int  b = (int)(this.a/10%10);
      int c = (int)(this.a%10);
      int num = e+a;
      System.out.println(num+"元"+b+"角"+"分");


  }

    public Money(float a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }


}

