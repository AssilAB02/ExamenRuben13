package Entregas.Entrega1;

class BookCreator implements MediaCreator {
    @Override
    public Media createMedia() {
        return new Book();
    }
}
