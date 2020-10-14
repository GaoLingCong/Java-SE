public class D2接口的私有方法定义  implements D3接口的私有方法定义{
    public void methob4(){
       //  A();
        //重复方法抽取();   //直接访问到了接口的默认方法，这样是错误的
        //改成私有化方法后这里会报错
        //马上报错因为我改成了private
    }
}
