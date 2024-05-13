package Entregas.Entrega2;

class BookBuilder implements MediaBuilder {
    private Media book = new Media();

    @Override
    public MediaBuilder setTitle(String title) {
        book.setTitle(title);
        return this;
    }

    @Override
    public MediaBuilder setAuthor(String author) {
        book.setAuthor(author);
        return this;
    }

    @Override
    public MediaBuilder setYear(int year) {
        book.setYear(year);
        return this;
    }

    @Override
    public Media build() {
        return book;
    }
}