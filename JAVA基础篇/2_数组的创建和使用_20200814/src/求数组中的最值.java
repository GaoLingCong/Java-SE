public class 求数组中的最值 {
    public static void main(String[] args) {

        int array[]={5,15,30,58,10000};
        int max;
        max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max);
            max=array[i];
        }
        System.out.println("最大值"+max);
        }



}

