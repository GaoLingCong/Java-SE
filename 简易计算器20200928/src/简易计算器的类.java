public class 简易计算器的类 {
    private int left;
    private int right;



    public 简易计算器的类() {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return Integer.parseInt(String.valueOf(left)) ;
    }

    public int getRight() {
        return Integer.parseInt(String.valueOf(right));
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int cala (String opr)
        {
            int result=0;
            int x = getLeft(),y=getRight();
            switch (opr){
                case"+":
                result= x + y;
                break;
                case"-":
                result= x - y;
                break;
                case"*":
                result= x*y;
                break;
                case"/":
                result= x/y;
                break;
                case"mi":
                    result=mi();
            }
            return result;
        }



    private int mi()
    {
        int x = getLeft(),y=getRight();
        int m = (int) Math.pow(x, y);
       return m;

    }

}
