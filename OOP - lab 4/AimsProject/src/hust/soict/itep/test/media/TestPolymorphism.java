package hust.soict.itep.test.media;

import hust.soict.itep.aims.media.*;

import java.util.ArrayList;
import java.util.List;

public class TestPolymorphism {
    public static void main(String[] args) {
        List<Media> mediaList = new ArrayList<>();
    
        CompactDisc cd = new CompactDisc(1, "Hits of Nguyen Tri Nam", "Classical", 22.99f, 15, "Nguyen Tri Nam", "Nguyen Tri Nam");
        DigitalVideoDisc dvd = new DigitalVideoDisc("Dreams of Nguyen Tri Nam", "Fantasy", "Nguyen Tri Nam", 120, 21.99f);
        Book book = new Book(1, "AI with Nguyen Tri Nam", "Technology", 35.99f);
    
        mediaList.add(cd);
        mediaList.add(dvd);
        mediaList.add(book);
    
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
    
}
