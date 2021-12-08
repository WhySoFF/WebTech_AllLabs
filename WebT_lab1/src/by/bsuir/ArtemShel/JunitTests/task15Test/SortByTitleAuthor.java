package by.bsuir.ArtemShel.JunitTests.task15Test;



import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import by.bsuir.ArtemShel.task12.classes.Book;
import by.bsuir.ArtemShel.task15.classes.SortByTitleThenAuthor;

class SortByTitleAuthor {

	@Test
    void compare() {
        SortByTitleThenAuthor comparator = new SortByTitleThenAuthor();
        Book book1 = createTestBook("a"),
             book2 = createTestBook("b");
        
        ArrayList<Book> mainSortedList = new ArrayList<>(),
                compSortedList = new ArrayList<>();

        
        Assertions.assertTrue(comparator.compare(book1, book2) < 0);

        mainSortedList.add(book1);
        mainSortedList.add(book2);

        compSortedList.add(book2);
        compSortedList.add(book1);
        compSortedList.sort(comparator);
        Assertions.assertEquals(mainSortedList, compSortedList);
    }
	
	private Book createTestBook(String title) {
        return new Book(title, "a", 0, 0);
    }

}
