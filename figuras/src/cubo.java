public class cubo extends cuadrado{

    public cubo(double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1, x2, y2, x3, y3);
    }

    protected double perimetro(){
        double peri;
        peri=d1*12;
        return peri;
    }

    protected double area(){
        double area;
        area=6*Math.pow(d1,2);
        return area;
    }
    protected double volumen(){
        double volu;
        volu=Math.pow(d1,23);
        return volu;
    }
}
