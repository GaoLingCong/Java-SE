import javax.print.DocFlavor;

public class 用重载的方法比较两个数据是否相等 {
    public static void main(String[] args) {
        byte a=10;
        byte b=5;
        System.out.println(B(a,b));
        System.out.println(B(10,10));
        System.out.println(B(10L,10L));

        System.out.println(B((short)10,(short)20));

    }

    public static boolean B(byte a, byte b) {
        System.out.println("两个BYTE");
        boolean same;
        if (a == b) {
            same = true;

        } else {
            same = false;
        }
        return same;
    }


        public static boolean B(short a, short b) {
            System.out.println("两个shout");
            boolean same;
            same = a==b?true:false;
            return  same;

        }
        public static boolean B(int a, int b) {
            System.out.println("两个int");
        return a==b;

    }
public static boolean B(long a,long b)
{
    System.out.println("两个long");
    if(a==b){
        return true;
    }else {
        return false;
    }
}

    };