public class 字符反转输出 {
    public static void main(String[] args) {
        String name = "孙悟空";
        System.out.println("反转前  "+name);
        String rename = new StringBuffer(name).reverse().toString();
        System.out.println("反转后  "+rename);
    }
}
