package Entregas.Entrega1.FactoryMethod;



class MagazineCreator implements MediaCreator {
    @Override
    public Media createMedia() {
        return new Magazine();
    }
}