package Entregas.Entrega2.Adapter;

class MediaAdapter implements Media {
    private File file;

    public MediaAdapter(File file) {
        this.file = file;
    }

    @Override
    public void displayInfo() {
        file.read();
    }
}
