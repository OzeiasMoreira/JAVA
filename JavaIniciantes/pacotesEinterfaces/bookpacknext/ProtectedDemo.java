package pacotesEinterfaces.bookpacknext;

import pacotesEinterfaces.bookpack.Book;

public class ProtectedDemo {
    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("Java para Iniciantes","Hebert Schildt", 2024, "UENP");
        books[1] = new ExtBook("Java para Iniciantes","Hebert Schildt", 2024, "UENP");
        books[2] = new ExtBook("Java para Iniciantes","Hebert Schildt", 2024, "UENP");
        books[3] = new ExtBook("Java para Iniciantes","Hebert Schildt", 2024, "UENP");
        books[4] = new ExtBook("Java para Iniciantes","Hebert Schildt", 2024, "UENP");

        for(int i = 0;i < books.length; i++){
            books[i].show();
        }

        System.out.println("Encontra o livro por author: ");
        for(int i = 0; i < books.length; i++){
            if (books[i].getAuthor() == "Shildt") {
                System.out.println(books[i].getTitle());
            }
        }

        // books[0].title = "test title"; Erro, não pode ser acessado, pois o campo protected não é permitido a não subclasses
    }
}
