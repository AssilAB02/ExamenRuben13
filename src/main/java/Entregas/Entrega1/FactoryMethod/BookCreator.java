package Entregas.Entrega1.FactoryMethod;

import Entregas.Entrega1.Media;

class BookCreator implements MediaCreator {
    @Override
    public Media createMedia() {
        return new Book();
    }
}
