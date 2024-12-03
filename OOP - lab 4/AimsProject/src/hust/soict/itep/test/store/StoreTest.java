package hust.soict.itep.test.store;

import hust.soict.itep.aims.store.Store;
import hust.soict.itep.aims.media.DigitalVideoDisc;
import hust.soict.itep.aims.media.Book;
import hust.soict.itep.aims.media.CompactDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
    
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Dreams of Nguyen Tri Nam", "Fantasy", "Nguyen Tri Nam", 120, 21.99f);
        store.addMedia(dvd1);
    
        Book book1 = new Book(1, "AI Innovations by Nguyen Tri Nam", "Technology", 35.99f);
        store.addMedia(book1);
    
        CompactDisc cd1 = new CompactDisc(1, "Hits of Nguyen Tri Nam", "Classical", 22.99f, 75, "Nguyen Tri Nam", "Nguyen Tri Nam");
        store.addMedia(cd1);
    
        store.displayItemsInStore();
    
        store.removeMedia(dvd1);
    
        store.displayItemsInStore();
    }
    
}
