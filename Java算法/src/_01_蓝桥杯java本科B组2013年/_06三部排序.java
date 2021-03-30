package _01_蓝桥杯java本科B组2013年;
/*一般的排序有许多经典算法，如快速排序、希尔排序等。

        但实际应用时，经常会或多或少有一些特殊的要求。我们没必要套用那些经典算法，可以根据实际情况建立更好的解法。

       比如，对一个整型数组中的数字进行分类排序：

       使得负数都靠左端，正数都靠右端，0在中部。注意问题的特点是：负数区域和正数区域内并不要求有序。可以利用这个特点通过1次线性扫描就结束战斗!!

        以下的程序实现了该目标。

public class _06三部排序 {
    public static void main(String[] args) {
        int[] arr = {25,18,-2,0,16,-5,33,21,0,19,-16,25,-3,0};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    static void sort(int[] x) {
        int p = 0;
        int left = 0;       //最小小标
        int right = x.length - 1; //最大下标

        while(p<=right){
            if(x[p]<0){
                //元素小于0，将元素和left位置交换
                int t = x[left];
                x[left] = x[p];
                x[p] = t;
                left++;
                p++;
            }
            else if(x[p]>0){
                //如果元素大于0，将元素和right交换
                int t = x[right];
                x[right] = x[p];
                x[p] = t;
                right--;
            }
            else {
                //元素等于0
                p++;
            }

        }
    }
}



        */

public class _06三部排序 {
    public static void main(String[] args) {
        int x[]={1,0,-2,-3,5,7,10,0,-42,0,0,2};
        arr(x);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }

    }
    public  static void arr(int[]x ){
        int left=0;//左
        int right=x.length-1;//右
        int p=0;//移动

        while (p<=right){
            if (x[p]>0){
                int t = x[right];
                x[right] = x[p];
                x[p]=t;
                right--;
            }else if (x[p]<0){
                int t = x[left];
                x[left] = x[p];
                x[p]=t;
                left++;
                p++;
            }else {
                p++;
            }
        }
    }
}
