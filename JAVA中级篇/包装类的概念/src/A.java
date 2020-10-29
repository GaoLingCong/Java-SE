import java.util.Arrays;

public class A {
    public static void main(String[] args) {
         arraycopy();
    }
    private  static  void arraycopy()
    {
        //第一步定义源数组
        int [] src = {1,2,3,4,5,6,};
        //第二步定义目标数组
        int [] dest= {6,7,8,9,10};
        System.out.println("复制前"+ Arrays.toString(dest));
        // 使用System类中的arraycopy把源数组的前3个元素复制到目标数组的前3个位置上
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后"+Arrays.toString(dest));

    }

}
