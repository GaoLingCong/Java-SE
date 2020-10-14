import java.util.ArrayList;

public class Arraylist集合的遍历输出 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("高灵聪");
        list.add("迪丽热巴");
        list.add("玛卡巴卡");
        list.add("古西迪西");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
