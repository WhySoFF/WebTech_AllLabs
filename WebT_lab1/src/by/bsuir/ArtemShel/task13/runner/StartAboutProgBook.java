package by.bsuir.ArtemShel.task13.runner;

import by.bsuir.ArtemShel.scanner.InputData;
import by.bsuir.ArtemShel.task12.classes.Book;
import by.bsuir.ArtemShel.task13.classes.ProgrammerBook;

public class StartAboutProgBook {

	public static void main(String[] args) {
		Book book1;
		Book book2;
		
		
		System.out.print("Enter book edition: ");
	    Book.setEdition(InputData.inputPositiveInt());
	        
        try {
        	
            System.out.println("Set information about first book");
            book1 = InputData.setInformationAboutBook();
            System.out.print("Enter book language: ");
            String language = InputData.inputString();
            System.out.print("Enter book level: ");
            int level = InputData.inputPositiveInt();
            book1 = new ProgrammerBook(book1 ,language, level);
            
            System.out.println("Set information about second book");
            book2 = InputData.setInformationAboutBook();
            System.out.print("Enter book language: ");
            String language1 = InputData.inputString();
            System.out.print("Enter book level: ");
            int level1 = InputData.inputPositiveInt();
            book2 = new ProgrammerBook(book2 ,language1, level1);
            
        } catch (IllegalArgumentException e) {
        	
            System.out.println( e.getMessage());
            return;
        }

        System.out.println("Information about first book "+ book1.toString());
        System.out.println("Information about second book "+ book2.toString());
        System.out.println("Books hash codes:");
        System.out.println("Book 1 hashCode: " + book1.hashCode());
        System.out.println("Book 2 hashCode: " + book2.hashCode());

        System.out.println("Are books equal? " + book1.equals(book2));

        

	}

}
