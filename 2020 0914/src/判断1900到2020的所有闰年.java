public class 判断1900到2020的所有闰年 {
    public static void main(String[] args) {
        //算法1
       int[] a =new int[121];
       int C =1900;
       int num=0;
       for (int i=0;i<a.length;i++)
       {

           a[i]=C;
           C++;

       }
        System.out.println("1900到2020所有的闰年分别是一下");

        for (int i = 0; i< a.length; i++) {
            if((a[i]%400 == 0)||(a[i]%4 == 0 &&a[i]%100!=0))
            {

                System.out.println(a[i]);
                num++;
            }
        }
        System.out.println("1900到2020一共有："+num+"个闰年");
//算法2
        int B=0;
        for(int j=1900;j<=2020;j++)
        {
            if((j%400 == 0)||(j%4 == 0 &&j%100!=0))
            {
                System.out.println("1900到2020的闰年"+j);
                B++;
            }
        }
        System.out.println("1900到2020的闰年个数有"+B);
    }



    }

