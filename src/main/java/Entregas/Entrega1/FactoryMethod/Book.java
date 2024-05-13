package Entregas.Entrega1.FactoryMethod;

import Entregas.Entrega1.Media;

class Book implements Media {
    @Override
    public void displayInfo() {
        System.out.println("This is a book");
    }
}
