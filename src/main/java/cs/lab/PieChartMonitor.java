package cs.lab;

public class PieChartMonitor implements Subject {
    private int A;
    private int B;
    private int C;
    private int D;

    public PieChartMonitor(){}

    @Override
    public void setA(int value) {
        this.A = value;
    }

    @Override
    public void setB(int value) {
        this.B = value;
    }

    @Override
    public void setC(int value) {
        this.C = value;
    }

    @Override
    public void setD(int value) {
        this.D = value;
    }
}
