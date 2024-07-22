package DiagramaDeClassesEInterfaces.Classes;
import java.util.ArrayList;
import java.util.List;

public class Library{

	private List<Book> books;
	private List<Member> members;
	private List<Loan> loans;
	private List<Librarian> librarians;

	public Library() {
		books = new ArrayList<Book>();
		members = new ArrayList<Member>();
		loans = new ArrayList<Loan>();
		librarians = new ArrayList<Librarian>();
	}

	public void addBook(Book book) {
		books.add(book);
		System.out.println("Livro Adicionado");
	}
	public void getAllBooks() {
		for(Book book: books) {
			System.out.println(book);
		}
	}
	
	public void addMember(Member member) {
		members.add(member);
	}
	
	public void addLoan(Loan loan) {
		loans.add(loan);
	}
	public void addLibrarian(Librarian lib) {
		librarians.add(lib);
	}
	
}
