public class 重名类 {
    int num = 10;


  public   class  重名类2
    {
        int num = 20;
        public  void method()
        {
            int num = 30;
            System.out.println(num);//30
            System.out.println(this.num);//20

            //System.out.println(Outer.this.num);//

        }



    }






}
