package hust.soict.itep.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<>();

    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }

    @Override
    public String toString() {
        // Sử dụng danh sách tác giả và nối chúng thành chuỗi
        String authorList = String.join(", ", authors);  // Nối các tác giả thành chuỗi
        return "Book [ID=" + getId() + ", Title=" + getTitle() + ", Category=" + getCategory() + ", Cost=" + getCost() + ", Authors=" + authorList + "]";
    }
}
