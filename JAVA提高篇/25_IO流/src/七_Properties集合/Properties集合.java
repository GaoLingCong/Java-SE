package 七_Properties集合;

import java.util.Properties;
import java.util.Set;

/*
        使用Properties集合存储数据,遍历取出Properties集合中的数据
        Properties集合是一个双列集合,key和value默认都是字符串
        Properties集合有一些操作字符串的特有方法
            Object setProperty(String key, String value) 调用 Hashtable 的方法 put。
            String getProperty(String key) 通过key找到value值,此方法相当于Map集合中的get(key)方法
            Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串,此方法相当于Map集合中的keySet方法
     */
public class Properties集合 {
    public static void main(String[] args) {
        show();
    }

    private static void show() {
        //创建Properties集合对象
        Properties prop  = new Properties();
        //使用setProperty往集合中添加数据
        prop.setProperty("啊道","13");
        prop.setProperty("啊gao","17");
        prop.setProperty("啊cong","33");

        //使用stringPropertyNames把Properties集合中的键取出,存储到一个Set集合中
        Set<String> set = prop.stringPropertyNames();

        //遍历Set集合,取出Properties集合的每一个键
        for (String key : set){
            //使用getProperty方法通过key获取value
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);

        }

    }
}
