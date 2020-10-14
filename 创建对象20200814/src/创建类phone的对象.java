public class 创建类phone的对象 {
    public static void main(String[] args) {//有main才可以用
        //根据Phone类创建one对象
        Phone one = new Phone();//格式  类 对象名 =  new 类（）；
        System.out.println(one.brand);//默认值 null
        System.out.println(one.color);//0.0
        System.out.println(one.price);//默认值


        one.price=4848;
        one.color="玫瑰金";
        one.brand="小米";
        System.out.println("=======================");
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        one.call("高灵聪");
        one.sendMessage();

    }
}
