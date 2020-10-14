public class 钱类 {
    private int Dollar;//元
    private int angle;//角
    private int deci;//分

    public 钱类(int dollar, int angle, int deci) {
        Dollar = dollar;
        this.angle = angle;
        this.deci = deci;




    }

    public int getDollar() {
        return Dollar;
    }

    public void setDollar(int dollar) {
        Dollar = dollar;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public int getDeci() {
        return deci;
    }

    public void setDeci(int deci) {
        this.deci = deci;
    }
}
