public class figuras {
    protected double d1,d2,d3;
    public figuras(double x1, double y1,double x2, double y2,double x3, double y3) {
        d1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        d2=Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
        d3=Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2));
    }

    public figuras(double x1, double y1,double x2, double y2) {
        d1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }

    @Override
    public String toString() {
        return "d1=" + d1 +"d2=" + d2 +"d3=" + d3 +"\n";
    }
}
