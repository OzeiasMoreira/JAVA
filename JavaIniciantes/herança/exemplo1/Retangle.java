package herança.exemplo1;

public class Retangle extends TwoDShape{
    Retangle(double w, double h){
        super(w, h);
    }
    
    boolean isSquare(){
        if (getWidth() == getHeight())  return true;
        return false;
    }

    double area(){
        return getWidth() * getHeight();
    }
}
