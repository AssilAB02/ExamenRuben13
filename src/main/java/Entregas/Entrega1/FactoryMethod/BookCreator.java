package Entregas.Entrega1.FactoryMethod;



class BookCreator implements MediaCreator {
    @Override
    public Media createMedia() {
        return new Book();
    }
}
