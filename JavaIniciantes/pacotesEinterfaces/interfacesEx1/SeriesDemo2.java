package pacotesEinterfaces.interfacesEx1;

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twosOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for(int i = 0;i < 5; i++){
            ob = twosOb;
            System.out.println("Next ByTwos value is: " + ob.getNext());

            ob = threeOb;
            System.out.println("Next ByThree value is: " + ob.getNext());
        }
    }
}
