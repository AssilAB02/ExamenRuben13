package Entregas.Entrega1.FactoryMethod;

import Entregas.Entrega1.Media;

class Magazine implements Media {
    @Override
    public void displayInfo() {
        System.out.println("This is a magazine");
    }
}