package DiagramaDeClassesEInterfaces.Classes;

import DiagramaDeClassesEInterfaces.Interfaces.IUser;

public class Librarian implements IUser {

	private String name;
	private String employeeId;
	
	public Librarian(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getId() {
		return this.employeeId;
	}

}
