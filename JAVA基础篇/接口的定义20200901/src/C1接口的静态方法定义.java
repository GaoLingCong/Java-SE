/*静态方法最大的特点就是不用生成类的实例对象，直接可以使用   直接方法名（）调用
* JAVA8开始，接口允许定义静态方法
*  格式
* public static 返回值类型 方法名称(参数列表){
*        方法体
* }
* 提示  就是将abstract或者default换成static即可  带上方法体
*
* */
public interface C1接口的静态方法定义 {
    public static void  methodstatic(){
        System.out.println("这是接口的静态方法");
    }
}

