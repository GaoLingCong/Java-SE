 /*一个抽象类不一定含有抽象方法
 * 只要保证抽象方法所在的类是抽象类，即可
 * 这样抽象方法的抽象类，也不一定直接创建对象，在一些特色场景下有用途*/
public class 抽象方法和抽象类的注意事项 {
    public static void main(String[] args) {
        Zi2 zi2 =  new Zi2();
        zi2.eat();
    }
}
