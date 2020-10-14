public class Zilei extends Fulei {
    int num = 20 ;
    public void methob(){
        int num = 30; //
        System.out.println(num);  // 本类的30  局部变量
        System.out.println(this.num); //20本类的成员变量
        System.out.println(super.num);//10父类的成员变量
    }

}
