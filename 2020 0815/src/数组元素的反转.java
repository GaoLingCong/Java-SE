public class 数组元素的反转 {
    public static void main(String[] args) {

        int array[] = {1, 5, 8, 4, 3, 8, 9, 6, 7};
        {
            for (int i = 0; i < array.length / 2; i++) {


                int C = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = C;


            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);

            }
        }
    }
}

