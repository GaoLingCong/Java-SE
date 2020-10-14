/*
* 注意事项对于基本类型当中的布尔值 Getter方法写成isXxx的方法的形式   而setXxx规则不变*/

public class Student {
    private  String name;
    private  int age;
    private  boolean male;

    public void setName(String str)
    {
        name=str;
    }
    public String getName()
    {
        return  name;
    }
    public  void setAge(int num)
    {
        num=age;
    }
    public  int  getAge()
    {
        return age;
    }
    public void setMale(boolean b)
    {
        male=b;
    }

    public boolean isMale() {     //这是布尔的特勒不要 getter 用isMale
        return male;
    }
}
