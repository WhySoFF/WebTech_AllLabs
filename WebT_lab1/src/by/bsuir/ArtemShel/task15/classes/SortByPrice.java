package by.bsuir.ArtemShel.task15.classes;

import java.util.Comparator;
import by.bsuir.ArtemShel.task12.classes.Book;

public class SortByPrice implements Comparator<Book> {

	
	@Override
    public int compare(Book book1, Book book2) {
        if ((book1 == null) || (book2 == null)) {
            throw new IllegalArgumentException("Both books shouldn't be null");
        }

        return Integer.compare(book1.getPrice(), book2.getPrice());
    }
	
}
