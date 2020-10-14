public class 内部类的创建
{


        private String name;

        public void method1()//外部类的方法
        {

            内部类 内类 = new 内部类();
            内类.method2();//间接调用
        }


        class 内部类
        {

            public void method2()
            {
                System.out.println("内部类方法");
            }







    }








}