/*
* 如何知道一个父类引用的对象，本来是什么子类？
* 格式；
* 对象 instanceof 类名称
* 这将会得到一个boolean值结果，也就是判断前面对象能不能当做后面类型的实例*/
public class 用instanceo关键字进行 {
    public void main(String[] args) {


        C1Animal animal = new C2Cat();
        animal.eat();//猫吃鱼

        //如果希望调用子类特有的方法，需要向下转型
        //判断一下父类引用animal本来不是dog
        if(animal instanceof C4Dog)
        {
     C4Dog dog = (C4Dog) animal;
     dog.watchehouse();
        }//判断下animal本来是不是cat
        if(animal instanceof C2Cat)
        {
   C2Cat cat = (C2Cat) animal;
   cat.猫抓老鼠();
        }
        giveMeApet(new C4Dog());

    }
    public void giveMeApet(C1Animal animal)
    {
        if(animal instanceof C4Dog)
        {
            C4Dog dog = (C4Dog) animal;
            dog.watchehouse();
        }//判断下animal本来是不是cat
        if(animal instanceof C2Cat)
        {
            C2Cat cat = (C2Cat) animal;
            cat.猫抓老鼠();
        }
    }
}
