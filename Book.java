
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    public String title;
    public String author;
    public int pages;
    public double price;
    public boolean isGood;
    public double stars;
    
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
    public void addRating(double stars){
        this.stars = Math.round(stars * 10) / 10.0;
    }

    @Override public String toString() {
    if (author != null) {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Stars: " + stars;
    } else if (author == null) {
        return "Title: " + title + ", isGood: " + isGood + ", Pages: " + pages + ", Price: " + price +", Stars: " + stars;
    } else {
        return super.toString();
    }
    }
}
