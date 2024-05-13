package Entregas.Entrega2.Adapter;

public class Adapter {
    public static void main(String[] args) {
        File file = new File("book.txt");
        Media book = new MediaAdapter(file);
        book.displayInfo();
    }
}