public class 类作为成员变量的类型 {
    private int age;
    private String  wuqi;
    private Hero hero;


    public 类作为成员变量的类型() {
    }

    public 类作为成员变量的类型(int age, String wuqi, Hero hero) {
        this.age = age;
        this.wuqi = wuqi;
        this.hero = hero;
    }


    public void method()
    {
        System.out.println("年龄为"+age+"的"+ hero.getName("高灵聪")+"用"+wuqi+"去打怪");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWuqi() {
        return wuqi;
    }

    public void setWuqi(String wuqi) {
        this.wuqi = wuqi;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
