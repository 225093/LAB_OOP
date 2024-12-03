package hust.soict.itep.aims.cart;

import hust.soict.itep.aims.media.Media;

import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("Media has been added");
        } else {
            System.out.println("Cart is full");
        }
    }

    public void addMedia(Media[] mediaList) {
        for (Media media : mediaList) {
            if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
                itemsOrdered.add(media);
                System.out.println("Media " + media.getTitle() + " has been added");
            } else {
                System.out.println("Cart is full, cannot add " + media.getTitle());
                break; 
            }
        }
    }

    public void addMedia(Media media1, Media media2) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media1);
            System.out.println("Media " + media1.getTitle() + " has been added");
        } else {
            System.out.println("Cart is full, cannot add " + media1.getTitle());
        }

        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media2);
            System.out.println("Media " + media2.getTitle() + " has been added");
        } else {
            System.out.println("Cart is full, cannot add " + media2.getTitle());
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("Media has been removed");
        } else {
            System.out.println("Media not found in cart");
        }
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        for (int i = 0; i < itemsOrdered.size(); i++) {
            Media media = itemsOrdered.get(i);
            System.out.println((i + 1) + ". " + media.toString());
            totalCost += media.getCost();
        }
        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

   
}
