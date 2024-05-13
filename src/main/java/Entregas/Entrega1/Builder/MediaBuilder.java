package Entregas.Entrega1.Builder;

interface MediaBuilder {
    MediaBuilder setTitle(String title);
    MediaBuilder setAuthor(String author);
    MediaBuilder setYear(int year);
    Media build();
}