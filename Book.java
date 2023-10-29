import java.util.ArrayList;

/**
 * Book class description
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book {
    // relevent primitive variables
    public String title;
    public String author;
    public int pages;
    public double price;
    public boolean isGood;
    public ArrayList<Double> ratings = new ArrayList<>(); // double arraylist

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, boolean isGood, int pages, double price) {
        // using this referencing to differentiate between the two constructors
        this.title = title;
        this.isGood = isGood;
        this.pages = pages;
        this.price = price;
    }

    public void addRating() { //
        double randomRating = Math.round((Math.random() * 5) * 10) / 10.0; // rounds ratings to 1 decimal place
        ratings.add(randomRating);
    }

    public double getAverageRating() {
        double sum = 0;
        for (double rating : ratings) { // traverses through ratings, adds sum to rating
            sum += rating;
        }
        return ratings.size() > 0 ? Math.round((sum / ratings.size()) * 100) / 100.0 : 0; // rounds ratings to 2 decimal
                                                                                          // places if condition is met
    }

    @Override
    public String toString() {
        if (author != null) { // checking whether author is null or not, seeing which constructor was used
            return "Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Average Rating: "
                    + getAverageRating(); // first constructor
        } else {
            return "Title: " + title + ", isGood: " + isGood + ", Pages: " + pages + ", Price: " + price
                    + ", Average Rating: " + getAverageRating(); // second constructor
        }
    }
}
