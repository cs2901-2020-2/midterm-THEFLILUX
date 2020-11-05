package cs.lab;

public class Subject {
    private int A;
    private int B;
    private int C;
    private int D;

    public Subject(int A, int B, int C, int D){
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public void setA(int value){
        this.A = value;
    }

    public void setB(int value){
        this.B = value;
    }

    public void setC(int value){
        this.C = value;
    }

    public void setD(int value){
        this.D = value;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public int getC() {
        return C;
    }

    public int getD() {
        return D;
    }
}
