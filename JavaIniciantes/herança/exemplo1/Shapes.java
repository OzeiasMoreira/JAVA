package herança.exemplo1;

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("outlined", 8.0, 12.0);
        Triangle t3 = new Triangle(10);

        t1 = t2;

        System.out.println("T1 info: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is: " + t1.area());

        System.out.println();

        System.out.println("T2 Info: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("area is: " + t2.area());

        System.out.println();

        System.out.println("Info for T3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("area is: " + t3.area());
    }
}
