public class 接口作为成员变量类型 {
    public static void main(String[] args) {
        英雄 英雄1 = new 英雄();
        英雄1.setName("高灵聪");
        //设置英雄技能
        //第一种
//        英雄1.setsKill(new SKillimpl实现类());//使用单独的实现类

//第二种
//        还可以改成使用匿名内部类
        SKill skill = new SKill() {
            @Override
            public void use() {
                System.out.println("pia pia pia");
            }
        };
//        英雄1.attack();
//        英雄1.setsKill(skill);
        //第三种进一步简化  使用匿名内部类和匿名对象
        英雄1.setsKill(new SKill() {
            @Override
            public void use() {
                System.out.println("biu biu biu biu");
            }
        });

    }

}
