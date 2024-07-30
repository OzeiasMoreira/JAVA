package pacotesEinterfaces.interfacesEx1;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for(int i = 0;i < 5; i++){
            System.out.println("The next value is: " + ob.getNext());
        }

        System.out.println("\nReseting...");
        ob.reset();
        for(int i = 0;i < 5; i++){
            System.out.println("The next value is: " + ob.getNext());
        }

        System.out.println("Starting at 100");
        ob.setStart(100);
        for(int i = 0;i < 5; i++){
            System.out.println("The next value is: " + ob.getNext());
        }
    }
}
