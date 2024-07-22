package DiagramaDeClassesEInterfaces.Classes;

import DiagramaDeClassesEInterfaces.Interfaces.IUser;

public class Member implements IUser {

	private String name;
	private String memberId;
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getId() {
		return this.memberId;
	}

}
