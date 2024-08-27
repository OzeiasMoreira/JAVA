package herança.exemplo1;

// Uma classe para objeto de duas dimensões
public class TwoDShape {
    private double width;
    private double height;

    TwoDShape(){
        width = height = 0.0;
    }

    TwoDShape(double w, double h){
        this.width = w;
        this.height = h;
    }

    //Constroi um objeto com largura e altura iguais
    TwoDShape(double x){
        width = height = x;
    }

    void showDim(){
        System.out.println
        ("Width and height are:" + width + " and " + height);
    }

    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }

    public void setWidth(double w){
        width = w;
    }

    public void setHeight(double h){
        height = h;
    }
}
