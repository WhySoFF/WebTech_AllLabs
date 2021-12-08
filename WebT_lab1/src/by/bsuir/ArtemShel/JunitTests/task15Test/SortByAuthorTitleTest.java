package by.bsuir.ArtemShel.JunitTests.task15Test;


import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import by.bsuir.ArtemShel.task12.classes.Book;
import by.bsuir.ArtemShel.task15.classes.SortByAuthorThenTitle;

class SortByAuthorTitleTest {

	@Test
    void compare() {
        SortByAuthorThenTitle comparator = new SortByAuthorThenTitle();
        Book book1 = createTestBook("1","1"),
             book2 = createTestBook("2","2");
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
	
	private Book createTestBook(String author, String title) {
        return new Book(title, author, 0, 0);
    }


}
