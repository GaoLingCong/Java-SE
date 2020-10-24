/*
* 在多态的代码当中，成员方法的访问规则是
* 看 new 是谁就优先用谁，没有则向上找
* 口诀：编译看左边 运行看右边
* 对比
* 成员变量：编译看左边，运行还看左边
* 成员方法：编译看左边，运行看右边 */
public class C1多态中使用成员方法特 {
    public static void main(String[] args) {
        B1Fu  obj = new B2Zi();//多态
        obj.method();//  父子都有 new的是子  所以优先用子
        obj.methodfu();//子类没有 父类有，向上找到父类使用
//  错误写法      obj.ethodzi();//编译看左边，左边是fu，fu当中没有methodzi方法，所以编译报错

    }

}
