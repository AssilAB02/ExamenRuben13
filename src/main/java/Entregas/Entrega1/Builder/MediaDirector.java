package Entregas.Entrega1.Builder;

class MediaDirector {
    public Media createMedia(MediaBuilder builder, String title, String author, int year) {
        return builder
                .setTitle(title)
                .setAuthor(author)
                .setYear(year)
                .build();
    }
}