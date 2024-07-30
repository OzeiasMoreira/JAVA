package pacotesEinterfaces.interfacesEx1;

public class ByThrees implements Series {
    int val;
    int start;
    int prev;

    ByThrees(){
        start = 0;
        val = 0;
    }

    public int getNext(){
        prev = val;
        val += 3;
        return val;
    }

    public void reset(){
        val = start;
        prev = start - 3;
    }

    public void setStart(int x){
        start = x;
        val = x;
        prev = x - 3;
    }

    public int getPrevious(){
        return prev;
    }
}
