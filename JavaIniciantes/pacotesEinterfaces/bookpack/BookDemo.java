package pacotesEinterfaces.bookpack;

public class BookDemo {
    public static void main(String[] args) {
        Book books[] = new Book[5];
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
