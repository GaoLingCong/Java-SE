public class Money {
    private float a;

    public Money() {

    }


    //加法
    public float add(double a, double b)
    {
        return (float) (a+b);
    }

    //减法
    public float subtract(double a, double b)
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


    public void method5 (float a)
    {

        int e = (int)(a);//千位
        int  b = (int)(a*10%10);
        int c = (int)(a*100%10);

        System.out.println(e+"元"+b+"角"+c+"分");
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

