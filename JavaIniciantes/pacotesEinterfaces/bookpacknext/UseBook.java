package pacotesEinterfaces.bookpacknext;

import pacotesEinterfaces.bookpack.Book;

public class UseBook {
    public static void main(String[] args) {
        pacotesEinterfaces.bookpack.Book books[] = new pacotesEinterfaces.bookpack.Book[5];
        books[0] = new Book("Java para Iniciantes","Hebert Schildt", 2024);
        books[1] = new Book("Java para Iniciantes","Hebert Schildt", 2024);
        books[2] = new Book("Java para Iniciantes","Hebert Schildt", 2024);
        books[3] = new Book("Java para Iniciantes","Hebert Schildt", 2024);
        books[4] = new Book("Java para Iniciantes","Hebert Schildt", 2024);

        for(int i = 0;i < books.length; i++){
            books[i].show();
        }
    }
}
