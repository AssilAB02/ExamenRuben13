package Entregas.Entrega1;

class NewspaperCreator implements MediaCreator {
    @Override
    public Media createMedia() {
        return new Newspaper();
    }
}