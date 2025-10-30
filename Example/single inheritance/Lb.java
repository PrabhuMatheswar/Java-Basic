class Library {
    void showLibrary() {
        System.out.println("Welcome to the Connemara Library.");
    }
}

class Book extends Library {
    void showBook() {
        System.out.println("Book Title: Java Programming");
    }
}

public class Lb {
    public static void main(String[] args) {
        Book b = new Book();
        b.showLibrary(); 
        b.showBook();     
    }
}
