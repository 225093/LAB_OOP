package hust.soict.itep.test.media;

import hust.soict.itep.aims.media.*;

public class TestPlayable {
    public static void main(String[] args) {
        DigitalVideoDisc dvd = new DigitalVideoDisc("The Dream World", "Fantasy", "Nguyen Tri Nam", 120, 21.99f);
        System.out.println("Testing DigitalVideoDisc play:");
        dvd.play();
    
        Track track1 = new Track("Song by Nguyen Tri Nam", 5);  // 5 minutes
        Track track2 = new Track("Melody of the Night", 6);    // 6 minutes
    
        System.out.println("\nTesting Track play:");
        track1.play();
        track2.play();
    
        CompactDisc cd = new CompactDisc(1, "Greatest Hits by Nguyen Tri Nam", "Classical", 22.99f, 12, "Nguyen Tri Nam", "Nguyen Tri Nam");
        System.out.println("\nTesting CompactDisc play:");
        cd.play();
    }
    
}

