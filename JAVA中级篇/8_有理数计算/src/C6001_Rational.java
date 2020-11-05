public class C6001_Rational implements Cloneable {
  private int numerator;//分子
  private int denominator;//分母
  public static int count;
  static {
      count = 0;//演示静态初始化块，这里可以采用声明初始化
  }

    public C6001_Rational() {
    }

    public C6001_Rational(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);//使用set访问器初始化，避免代码重复
    }


    public C6001_Rational(int x){
      this(x,1);//构造方法复用方式
    }
    public String getInfo(){
      simplify();
      if(denominator == 1)
      return String.valueOf(numerator);
      return  String.format("%d/%d",numerator,denominator);
    }

    public static int gcd(int a,int b)//求最小公倍数
    {
        int r;
        while ((r=a%b)!=0)
        {
            a=b;
            b=r;
        }
        return b;
    }

    public C6001_Rational add(C6001_Rational right)//方法数据类型为本类递归
    {
        //新分数分子=分子分母相+分子分母相乘  分母=分木*分母
        int x = this.numerator*right.denominator+this.denominator*right.numerator;
        int y = this.denominator*right.denominator;
        return new C6001_Rational(x,y);//调用构造方法初始化值
    }

    public C6001_Rational add(C6001_Rational y,C6001_Rational...args)
    {//使用可变参数实现多个参数加法，不要一个个构造方法那么麻烦
        C6001_Rational sum = this.add(y);
        for (int i = 0; i < args.length; i++) {
            sum=sum.add(args[i]);
        }
        return sum;
    }

    public C6001_Rational sub(C6001_Rational right)//减法变为加法，加负数即可复用加法代码
    {
        C6001_Rational y = new C6001_Rational(-right.numerator,right.denominator);
        return  this.add(y);
    }
    public C6001_Rational mul (C6001_Rational right)
    {
        int x = this.numerator * right.numerator;
        int y = this.denominator * right.denominator;
        return new C6001_Rational(x,y);//借用构造方法来传出两个参数
    }
    //除法可变乘法，乘其倒数即可复用乘法代码
    public C6001_Rational div(C6001_Rational right)
    {
        C6001_Rational c = new C6001_Rational(right.denominator,right.numerator);
        return this.mul(c);
    }

    private void simplify()
    {
        int gcd = gcd(Math.abs(numerator),Math.abs(denominator));
        numerator = numerator/gcd;
        denominator = denominator/gcd;
        if(denominator<0)
        {
            numerator*=-1;
            denominator*=-1;
        }
    }
    // 重写equals 方法
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
      C6001_Rational other = (C6001_Rational) obj;
      C6001_Rational result = other.sub(this);
      return result.numerator==0;
    }
    //重写toString方法
    @Override
    public String toString() {
       simplify();
       if(denominator==1)//如果分母为1直接输出分子
           return String.valueOf(numerator);
       return String.format("%d/%d",numerator,denominator);
    }

    //拷贝的方法
    @Override
    protected C6001_Rational clone() throws CloneNotSupportedException {
        return (C6001_Rational) super.clone();
    }


    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
      if(denominator!=0)
        this.denominator = denominator;
    }
}
