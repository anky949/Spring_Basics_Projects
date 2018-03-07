package six_Bean_Inheritance;

public class Triangle {
    private points A;
    private points B;
    private points C;

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                '}';
    }

    public points getA() {
        return A;
    }

    public void setA(points a) {
        A = a;
    }

    public points getB() {
        return B;
    }

    public void setB(points b) {
        B = b;
    }

    public points getC() {
        return C;
    }

    public void setC(points c) {
        C = c;
    }
}
