/*
第一步在类的右边+<E>
第二步把所以数据类型改成 E
*/

public class GenericClass<E> {
    private E A;

    public E getA() {
        return A;
    }

    public void setA(E A) {
        this.A = A;
    }
}
