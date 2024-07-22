package DiagramaDeClassesEInterfaces.Classes;

import DiagramaDeClassesEInterfaces.Interfaces.ILoanable;

public class Book implements ILoanable {

	private String title;
	private String author;
	private String ISBN;
	private boolean avaliable;
	
	public Book(String title, String author, String iSBN, boolean avaliable) {
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.avaliable = avaliable;
	}
	@Override
	public boolean isAvailable() {
		return this.avaliable;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", avaliable=" + avaliable + "]";
	}
	
	

}
