package Entregas.Entrega2;

interface MediaBuilder {
    MediaBuilder setTitle(String title);
    MediaBuilder setAuthor(String author);
    MediaBuilder setYear(int year);
    Media build();
}