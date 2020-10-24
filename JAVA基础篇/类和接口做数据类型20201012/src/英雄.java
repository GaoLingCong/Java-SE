public class 英雄 {
private String name;//英雄名称
private SKill sKill;//英雄法术技能  用接口作为类的成员属性

    public 英雄() {
    }

    public 英雄(String name, SKill sKill) {
        this.name = name;
        this.sKill = sKill;
    }

    public String getName() {
        return name;
    }
public void attack()
{
    System.out.println("我叫"+name+"开始释放技能");
    sKill.use();//调用接口中的
    System.out.println("释放技能完成");
}
    public void setName(String name) {
        this.name = name;
    }

    public SKill getsKill() {
        return sKill;
    }

    public void setsKill(SKill sKill) {
        this.sKill = sKill;
    }
}
