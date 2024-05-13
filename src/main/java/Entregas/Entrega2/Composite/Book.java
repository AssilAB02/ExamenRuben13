package Entregas.Entrega2.Composite;

class Book implements Media {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a book: " + title);
    }
}
