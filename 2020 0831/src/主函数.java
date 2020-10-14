public class 主函数 {


    public static void main(String[] args) {
/*//        Animal animal = new Animal() {  }  错误写法 */
       /* Dog dog = new Dog() {    }  错误写法
       *  */
        Dog2哈 ha = new Dog2哈();//这是普通类，可以直接new对象
        ha.eat();
        ha.sleep();
        System.out.println("===========================");
       DogGolden Doggolden = new DogGolden();
       Doggolden.sleep();
       Doggolden.eat();

    }
}
