public class piramide extends triangulo{

    public piramide(double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1, x2, y2, x3, y3);
    }

    protected double perimetro(){
        double peri;
        peri=(d1+d2+d3)*3;
        return peri;
    }

    protected double area(){
        double area;
        area=((d1*d2)/2)*3;
        return area;
    }
    protected double volumen(){
        double volu;
        volu=(Math.sqrt(3)/12)*d1*d2;
        return volu;
    }
}
