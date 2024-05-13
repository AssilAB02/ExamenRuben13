package Entregas.Entrega1.FactoryMethod;

import Entregas.Entrega1.Media;

class MagazineCreator implements MediaCreator {
    @Override
    public Media createMedia() {
        return new Magazine();
    }
}