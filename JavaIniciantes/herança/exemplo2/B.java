package herança.exemplo2;

public class B extends A{
    int i; // essa variavel oculta a variavel 'i' da classe A

    B(int a,int b){
        super.i = a; // super referencia a variavel 'i' da classe A
        i = b; // variavel 'i' da classe B
    }

    void show(){
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
