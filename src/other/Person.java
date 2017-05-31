package other;

public class Person {
	private String username;
	private String password;
	private String email;
	private String gender;
	private String firstName;
	private String lastName;

	public Person(String username, String password, String firstName, String lastName, String email, String gender) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (p.getUsername().equalsIgnoreCase(this.username)) {
				return true;
			}
		}
		return false;
	}

}
