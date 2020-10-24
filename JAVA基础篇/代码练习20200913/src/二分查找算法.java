public class 二分查找算法 {
    public static void main(String[] args) {
        int [] a ={21,45,61,72,83,85,90,95};
        int index = find(a,60);
        System.out.println("元素的索引位置为"+index);
    }
    public static int find(int[] a ,int value){
        int index = -1;
        int left = 0 ;
        int right = a.length-1;
        while (left<=right){
            //int mid = (left+right)/2;
            int mid = (left+right)>>>1;//除于2有可能会导致算法溢出，得到复数索引指，java提供的无符号
            //右除达到处于2的效果
            if(value ==mid)
            {
                index = mid;
                break;
            }
            if (value>=mid) {

                right=mid-1;
            }
            else
                left = mid+1;
        }
        return index;



    }
}
