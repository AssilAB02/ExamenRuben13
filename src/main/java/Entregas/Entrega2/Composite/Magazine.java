package Entregas.Entrega2.Composite;

class Magazine implements Media {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a magazine: " + title);
    }
}