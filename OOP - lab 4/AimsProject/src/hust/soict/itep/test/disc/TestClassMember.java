package hust.soict.itep.test.disc;
import hust.soict.itep.aims.media.DigitalVideoDisc;

public class TestClassMember {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Brave Jungle");
        System.out.println("DVD 1 - ID: " + dvd1.getId() + ", Title: " + dvd1.getTitle());

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Fantasy", "The Magical Jungle", 18.0f);
        System.out.println("DVD 2 - ID: " + dvd2.getId() + ", Title: " + dvd2.getTitle());

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Nguyen Tri Nam", "Adventure", "Journey to the Unknown", 130, 25.0f);
        System.out.println("DVD 3 - ID: " + dvd3.getId() + ", Title: " + dvd3.getTitle());

        System.out.println("Total number of DigitalVideoDiscs: " + DigitalVideoDisc.getNbDigitalVideoDiscs());

    }
}
