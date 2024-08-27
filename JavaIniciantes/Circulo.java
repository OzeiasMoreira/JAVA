public class Circulo implements IForma{
    private double area;

    public double getArea(){
        return area;
    }

    public void setArea(double a){
        area = a;
    }

    @Override
    public double calcularArea(){
        return Math.PI * area * area;
    }
}
