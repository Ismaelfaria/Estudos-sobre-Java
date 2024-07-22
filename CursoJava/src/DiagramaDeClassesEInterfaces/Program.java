package DiagramaDeClassesEInterfaces;

import DiagramaDeClassesEInterfaces.Classes.Book;
import DiagramaDeClassesEInterfaces.Classes.Library;

public class Program {

	public static void main(String[] args) {

		Library lib = new Library();
		Book bo = new Book("O codificador limpo", "Esqueci", "1234", true);
		Book bo2 = new Book("O gato de botas", "Não sei", "1234", true);
		
		lib.addBook(bo);
		lib.addBook(bo2);
		lib.getAllBooks();

	}

}
