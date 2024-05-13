package Entregas.Entrega2.Adapter;

class Book implements Media {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + title);
    }
}
