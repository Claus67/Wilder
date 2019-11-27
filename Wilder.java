
public class Wilder {

	private String firstname;
	private boolean present;

	public Wilder(String firstname, boolean present) {
		super();
		this.firstname = firstname;
		this.present = present;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public boolean isPresent() {
		return present;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}

	public String whoAmI() {

		if (isPresent() == true) {
			return "My name is " + this.getFirstname() + " and I am present";
		}

		else {
			return "My name is " + this.getFirstname() + " and I am not present";

		}

	}

}
