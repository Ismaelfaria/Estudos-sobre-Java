package DiagramaDeClassesEInterfaces.Classes;

import java.util.Date;

public class Loan {

	private Date loanDate;
	private Date dueDate;
	private Book book;
	private Member member;
	
	
	public Loan(Date loanDate, Date dueDate, Book book, Member member) {
		this.loanDate = loanDate;
		this.dueDate = dueDate;
		this.book = book;
		this.member = member;
	}
	
	
}
