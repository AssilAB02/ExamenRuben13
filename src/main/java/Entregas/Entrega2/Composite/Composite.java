package Entregas.Entrega2.Composite;

public class Composite {
    public static void main(String[] args) {
        Media book1 = new Book("Book 1");
        Media book2 = new Book("Book 2");
        Media magazine1 = new Magazine("Magazine 1");

        MediaGroup collection = new MediaGroup();
        collection.add(book1);
        collection.add(book2);
        collection.add(magazine1);

        collection.displayInfo();
    }
}

