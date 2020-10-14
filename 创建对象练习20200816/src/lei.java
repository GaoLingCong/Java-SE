/*
* 当方法的局部变量和类的成员变量重名的时候，根据就近原则   优先使用局部变量   参数就是局部变量
* 如果需要访问类当中的成员变量需要使用一个格式
*   this. 成员变量名
*
* 通过谁调用的方法谁就是this
**/
public class lei {
    String name;  //我自己的名字
    public void Hello(String name)
    {
        System.out.println(name+"你好，我叫："+this.name);
        System.out.println(this);
    }

}
