
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter Sorcerer Stone", "JK ROWLING", 343);
        Book starWarsTrilogy = new Book("Star Wars Trilogy", "George Lucas", 701);
        Book ionBiography = new Book("Ion Biography", true, 402, 3.5);
        Book obamaBiography = new Book("Obama Biography", true, 333, 4.5);
        
        obamaBiography.addRating((Math.random() * 6));
        ionBiography.addRating((Math.random() * 6));
        starWarsTrilogy.addRating((Math.random() * 6));
        harryPotter.addRating((Math.random() * 6));
        
        System.out.println(harryPotter.toString());
        System.out.println(starWarsTrilogy.toString());
        System.out.println(ionBiography.toString());
        System.out.println(obamaBiography.toString());
        
    }
}
