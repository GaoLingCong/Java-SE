public class 对象数组 {
    public static void main(String[] args) {
        Person []  array=new Person[3];
        Person one = new Person("古力娜扎",18);
        Person two = new Person("玛卡巴卡",28);
        Person shree = new Person("底细大戏",37);
        array[0]=one;
        array[1]=two;   //把地址传给数组1号元素位置
        array[3]=shree;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[0].getName());
        System.out.println(array[1].getName());
        System.out.println(array[2].getName());
    }

    }

