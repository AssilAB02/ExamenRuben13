package Entregas.Entrega1.FactoryMethod;

import Entregas.Entrega1.MagazineCreator;
import Entregas.Entrega1.Media;
import Entregas.Entrega1.NewspaperCreator;

public class FactoryMethod {
    public static void main(String[] args) {
        MediaCreator bookCreator = new BookCreator();
        Media book = bookCreator.createMedia();
        book.displayInfo();

        MediaCreator magazineCreator = new MagazineCreator();
        Media magazine = magazineCreator.createMedia();
        magazine.displayInfo();

        MediaCreator newspaperCreator = new NewspaperCreator();
        Media newspaper = newspaperCreator.createMedia();
        newspaper.displayInfo();
    }
}
