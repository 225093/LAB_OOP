package hust.soict.itep.test.cart;

import hust.soict.itep.aims.media.DigitalVideoDisc;
import hust.soict.itep.aims.cart.Cart;
import hust.soict.itep.aims.store.Store;
import hust.soict.itep.aims.media.*;

public class CartTest {
    public static void main(String[] args) {
        
        Cart cart = new Cart();

        

        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Python", "Animation", "Namdz", 37, 22.95f);
        cart.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Hust", "Science Fiction", "Ntnam", 87, 23.95f);
        cart.addMedia(dvd2);

        

       
        Book book1 = new Book(1, "Nha gia kim", "Educational", 22.99f);
        cart.addMedia(book1);

        Book book2 = new Book(2, "NLP", "Technology", 39.95f);
        cart.addMedia(book2);

        
        CompactDisc cd1 = new CompactDisc(1, "Sontung", "Pop", 15.99f, 30, "Mtp entertainment", "Various Performers");
        cart.addMedia(cd1);

        CompactDisc cd2 = new CompactDisc(2, "Peaky Blinder", "Rock", 17.49f, 75, "Thomas", "Shelby");
        cart.addMedia(cd2);
         
         cart.print();

        
    }
}
