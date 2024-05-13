package Entregas.Entrega1.FactoryMethod;

class NewspaperCreator implements MediaCreator {
    @Override
    public Media createMedia() {
        return new Newspaper();
    }
}