package Entregas.Entrega1;

class MagazineCreator implements MediaCreator {
    @Override
    public Media createMedia() {
        return new Magazine();
    }
}