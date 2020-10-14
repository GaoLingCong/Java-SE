public class 质数 {
    public static void main(String[] args) {
        for(int i = 2;i<100;i++)
        {
            int temp=0;
            for (int j = 2;j<i;j++)
            {
                if(i%j==0)
                {
                    temp=1;
                }
            }
            if(temp!=1)
            {
                System.out.println(i);
            }
        }
    }
}
