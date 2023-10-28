import java.util.ArrayList;

/**
 * Book class description
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book {
    public String title;
    public String author;
    public int pages;
    public double price;
    public boolean isGood;
    public ArrayList<Double> ratings = new ArrayList<>();

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, boolean isGood, int pages, double price) {
        this.title = title;
        this.isGood = isGood;
        this.pages = pages;
        this.price = price;
    }

    public void addRating() {
        double randomRating = Math.round((Math.random() * 5) * 10) / 10.0;
        ratings.add(randomRating);
    }

    public double getAverageRating() {
        double sum = 0;
        for (double rating : ratings) {
            sum += rating;
        }
        return ratings.size() > 0 ? Math.round((sum / ratings.size()) * 100) / 100.0 : 0;
    }

    @Override
    public String toString() {
        if (author != null) {
            return "Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Average Rating: "
                    + getAverageRating();
        } else {
            return "Title: " + title + ", isGood: " + isGood + ", Pages: " + pages + ", Price: " + price
                    + ", Average Rating: " + getAverageRating();
        }
    }
}
