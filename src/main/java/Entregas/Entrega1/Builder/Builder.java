package Entregas.Entrega1.Builder;

public class Builder {
    public static void main(String[] args) {
        MediaBuilder bookBuilder = new BookBuilder();
        MediaDirector director = new MediaDirector();
        Media book = director.createMedia(bookBuilder, "Book Title", "Author Name", 2024);
        book.displayInfo();
    }
}