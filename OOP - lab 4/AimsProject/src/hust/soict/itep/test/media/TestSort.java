package hust.soict.itep.test.media;

import hust.soict.itep.aims.media.Book;
import hust.soict.itep.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort {
    public static void main(String[] args) {
        ArrayList<Media> cart = new ArrayList<>();

        cart.add(new Book(1, "Journey of Nguyen Tri Nam", "Biography", 12.5f));
        cart.add(new Book(2, "AI Innovations by Nguyen Tri Nam", "Technology", 18.0f));
        cart.add(new Book(3, "Life and Dreams", "Inspirational", 15.0f));

        System.out.println("Before sorting:");
        for (Media media : cart) {
            System.out.println(media);
        }

        // Sắp xếp theo title rồi cost
        Collections.sort(cart, Media.COMPARE_BY_TITLE_COST);
        System.out.println("\nSorted by Title then Cost:");
        for (Media media : cart) {
            System.out.println(media);
        }

        // Sắp xếp theo cost rồi title
        Collections.sort(cart, Media.COMPARE_BY_COST_TITLE);
        System.out.println("\nSorted by Cost then Title:");
        for (Media media : cart) {
            System.out.println(media);
        }
    }
}
