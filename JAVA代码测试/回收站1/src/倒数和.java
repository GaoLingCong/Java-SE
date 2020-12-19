import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class 倒数和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float m,n,sum = 0;
        System.out.println("请输入m和n的值要求M<n");
        m=sc.nextInt();
        n=sc.nextInt();
       for (float i =m;i<=n;i++)
       {
            sum+=(1/i);
       }
        System.out.println(sum);
    }
}
