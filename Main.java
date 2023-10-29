import java.util.Arrays;
import java.util.List;

/**
 * Main class description
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {

        // various book objects, 2 use the first constructor, 2 use the second
        // constructor

        Book harryPotter = new Book("Harry Potter Sorcerer Stone", "JK ROWLING", 343);
        Book starWarsTrilogy = new Book("Star Wars Trilogy", "George Lucas", 701);
        Book ionBiography = new Book("Ion Biography", true, 402, 3.5);
        Book obamaBiography = new Book("Obama Biography", true, 333, 4.5);

        List<Book> books = Arrays.asList(harryPotter, starWarsTrilogy, ionBiography, obamaBiography); // Create a list
                                                                                                      // of books using
                                                                                                      // asList for
                                                                                                      // fixed amt, good
                                                                                                      // for adding the
                                                                                                      // objects.

        for (Book book : books) { // traverses through book objects
            for (int i = 0; i < 3; i++) {
                book.addRating(); // Add 3 random ratings for each book
            }
        }

        int totalPages = 0;
        int totalCharactersInTitles = 0;
        StringBuilder firstLettersOfAuthors = new StringBuilder(); // StringBuilder in Java represents a mutable
                                                                   // sequence of characters, did some research on what
                                                                   // ic ould use, since I could not create an empty
                                                                   // string and append each character to the string,
                                                                   // this would result in an error, as strings are
                                                                   // IMMUTABLE, so I used StringBuilder instead.
        StringBuilder lastLettersOfTitles = new StringBuilder();
        double totalAverageRatings = 0;

        System.out.println("\nBooks: \n");
        for (Book book : books) {
            System.out.println(book.toString());
            totalPages += book.pages; // Add up total pages
            totalCharactersInTitles += book.title.length(); // Add up total characters in titles
            if (book.author != null) { // If author is not null, append first letter of author's name
                firstLettersOfAuthors.append(book.author.charAt(0)); // to firstLettersOfAuthors
            }
            lastLettersOfTitles.append(book.title.charAt(book.title.length() - 1)); // Append last letter of title to
                                                                                    // lastLettersOfTitles
            totalAverageRatings += book.getAverageRating(); // Add up total average ratings
        }

        // printing out all relevent infomration

        System.out.println("\nTotal pages in all books: " + totalPages);
        System.out.println("Total characters in all book titles: " + totalCharactersInTitles);
        System.out.println("First letter of each author's name: " + firstLettersOfAuthors.toString());
        System.out.println("Last letter of each book's title: " + lastLettersOfTitles.toString());
        System.out.println(
                "Average rating of all the books: " + Math.round((totalAverageRatings / books.size()) * 100) / 100.0
                        + "\n"); // rounds
        // ratings
        // to
        // 2
        // decimal
        // places
    }
}
