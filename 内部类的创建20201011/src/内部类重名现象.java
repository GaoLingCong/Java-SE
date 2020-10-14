public class 内部类重名现象 {
    public static void main(String[] args) {

        重名类.重名类2 lei = new 重名类().new 重名类2();
        lei.method();
    }
}
