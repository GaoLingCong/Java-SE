public class Object类的equals方法 {
    /*
         Person类默认继承了Object类,所以可以使用Object类的equals方法
         boolean equals(Object obj) 指示其他某个对象是否与此对象“相等”。
         equals方法源码:
             public boolean equals(Object obj) {
                 return (this == obj);
             }
             参数:
                 Object obj:可以传递任意的对象
                 == 比较运算符,返回的是一个布尔值 true false
                 基本数据类型:比较的是值
                 引用数据类型:比价的是两个对象的地址值
            this是谁?那个对象调用的方法,方法中的this就是那个对象;p1调用的equals方法所以this就是p1
            obj是谁?传递过来的参数p2
            this==obj -->p1==p2
      */
    public static void main(String[] args) {
        Preson p1 = new Preson("迪丽热巴", 18);
        Preson p2 = new Preson("迪丽热巴", 18);
        boolean b = p1.equals(p2);
        System.out.println(b);

        /*
        直接打印对象的地址值没有意义,需要重写Object类中的toString方法
        打印对象的属性(name,age)

            /*@Override
    public String toString() {
       //return "abc";
       return "Person{name="+name+" ,age="+age+"}";
    }*/
    /*@Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/

    /*
        Object类的equals方法,默认比较的是两个对象的地址值,没有意义
        所以我们要重写equals方法,比较两个对象的属性(name,age)
        问题:
            隐含着一个多态
            多态的弊端:无法使用子类特有的内容(属性和方法)
            Object obj = p2 = new Person("古力娜扎",19);
            解决:可以使用向下转型(强转)把obj类型转换为Person
     */
    /*@Override
    public boolean equals(Object obj) {
        //增加一个判断,传递的参数obj如果是this本身,直接返回true,提高程序的效率
        if(obj==this){
            return true;
        }

        //增加一个判断,传递的参数obj如果是null,直接返回false,提高程序的效率
        if(obj==null){
            return false;
        }

        //增加一个判断,防止类型转换一次ClassCastException
        if(obj instanceof Person){
            //使用向下转型,把obj转换为Person类型
            Person p = (Person)obj;
            //比较两个对象的属性,一个对象是this(p1),一个对象是p(obj->p2)
            boolean b = this.name.equals(p.name) && this.age==p.age;

     */
    }
}