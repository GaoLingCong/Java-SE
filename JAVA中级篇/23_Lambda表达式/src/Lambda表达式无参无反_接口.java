import org.w3c.dom.css.CSSUnknownRule;

/*
    Lambda表达式有参数有返回值的练习
    需求:
        给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
        使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
 */
public class Lambda表达式无参无反_接口 {
    public static void main(String[] args) {
        invokeCale(120, 130, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a-b;
            }
        });

        invokeCale(120,130,(int a ,int b)->{
            return a+b;
        });

        invokeCale(120,130,(int a ,int b)->
    a+b);

    }
public static void invokeCale(int a ,int b ,Calculator c)
{
   int sum =  c.calc(a,b);
    System.out.println(sum);
}
}

