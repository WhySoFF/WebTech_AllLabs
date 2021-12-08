package by.bsuir.ArtemShel.JunitTests.task15Test;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import by.bsuir.ArtemShel.task12.classes.Book;
import by.bsuir.ArtemShel.task15.classes.SortByAuthor;

class SortByAuthorTest {

	@Test
    void compare() {
        SortByAuthor comparator = new SortByAuthor();
        Book book1 = createTestBook("1"),
             book2 = createTestBook("2");
        ArrayList<Book> mainSortedList = new ArrayList<>(),
                compSortedList = new ArrayList<>();

        Assertions.assertEquals(0, comparator.compare(book1, book1));
        Assertions.assertTrue(comparator.compare(book1, book2) < 0);

        mainSortedList.add(book1);
        mainSortedList.add(book2);

        compSortedList.add(book2);
        compSortedList.add(book1);
        compSortedList.sort(comparator);
        Assertions.assertEquals(mainSortedList, compSortedList);
    }
	
	private Book createTestBook(String author) {
        return new Book("a", author, 0, 0);
    }

}
