package hust.soict.itep.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        super(++nbDigitalVideoDiscs, title, null, 0, 0, null);
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, 0, null);
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, 0, director);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, length, director);
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public boolean isMatch(String title) {
        return getTitle().equalsIgnoreCase(title); 
    }

    @Override
    public String toString() {
        return "DVD [ID=" + getId() + ", Title=" + getTitle() + ", Category=" + getCategory() + ", Cost=" + getCost() + ", Length=" + length + " minutes]";
    }
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
