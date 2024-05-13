package Entregas.Entrega2.Adapter;

class File {
    private String filename;

    public File(String filename) {
        this.filename = filename;
    }

    public void read() {
        System.out.println("Reading file: " + filename);
    }
}