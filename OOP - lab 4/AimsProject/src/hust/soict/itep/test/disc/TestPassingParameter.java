package hust.soict.itep.test.disc;
import hust.soict.itep.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) { 
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        // Swap DVD objects
        swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        // Change the title of jungleDVD
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle DVD title after change: " + jungleDVD.getTitle());
    }

    
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        
        String temp = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(temp);
    }

    
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle); 
    }
}
