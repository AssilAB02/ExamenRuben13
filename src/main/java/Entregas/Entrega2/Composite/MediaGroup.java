package Entregas.Entrega2.Composite;

import java.util.*;

class MediaGroup implements Media {
    private List<Media> mediaList = new ArrayList<>();

    public void add(Media media) {
        mediaList.add(media);
    }

    @Override
    public void displayInfo() {
        for (Media media : mediaList) {
            media.displayInfo();
        }
    }
}
