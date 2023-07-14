public class circulo extends figuras{
    public circulo(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    protected double perimetro(){
        double peri;
        peri=2*Math.PI*d1;
        return peri;
    }

    protected double area(){
        double area;
        area=Math.PI*Math.pow(d1,2);
        return area;
    }
}
