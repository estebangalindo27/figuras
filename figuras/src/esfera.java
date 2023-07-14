public class esfera extends circulo{
    public esfera(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
    }

    protected double area(){
        double area;
        area=4*Math.PI*Math.pow(d1,2);
        return area;
    }
    protected double volumen(){
        double volu;
        volu=(4/3)*Math.PI*Math.pow(d1,3);
        return volu;
    }
}
