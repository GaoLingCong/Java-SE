import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
public class ArrayList集合存储基本数据 {

    /*
    如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”。
    ArrayList集合只能存储引用类型
    通过包装可以存储基本类

    基本类型    包装类（引用类型，包装类都位于java.lang包下）
    byte        Byte
    short       Short
    int         Integer     【特殊】
    long        Long
    float       Float
    double      Double
    char        Character   【特殊】
    boolean     Boolean

    从JDK 1.5+开始，支持自动装箱、自动拆箱。

    自动装箱：基本类型 --> 包装类型
    自动拆箱：包装类型 --> 基本类型

     */
    public static void main(String[] args) {
        ArrayList<String> arrayA = new ArrayList<>();
        //ArrayList<int>  arrayC = new ArrayList<>();//错误写法！泛型只能是引用类型，不是基本类型
        arrayA.add("666");
        arrayA.add("888");
        ArrayList<Integer> arratB = new ArrayList<>();
        arratB.add(10);
 arratB.add(5);
 int nuw = arratB.get(1);
        System.out.println("输出为"+nuw);
        System.out.println("包装后"+arratB.get(0));
    }
}







