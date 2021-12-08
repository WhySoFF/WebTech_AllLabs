package by.bsuir.ArtemShel.JunitTests.task12Test;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import by.bsuir.ArtemShel.task12.classes.Book;

class Task12Test {

	@Test
	void test() {
		Book book1 = new Book("romeo and juliet", "shakespeare", 20, 439);
		Book book2 = new Book("romeo and juliet", "shakespeare", 20, 439);
		Assertions.assertTrue( book1.equals(book2));
		Assertions.assertEquals( 0, book1.compareTo(book2));
		Book book3 = new Book("romeo and juliet", "shakespeare", 70, 429);
		Assertions.assertFalse( book1.equals(book3));
		Assertions.assertEquals( 10, book1.compareTo(book3));
	}

}
