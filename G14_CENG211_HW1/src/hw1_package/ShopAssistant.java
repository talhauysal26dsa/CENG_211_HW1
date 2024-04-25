package hw1_package;

public class ShopAssistant {
	private String Id;
	private String name;
	private String surname;
	private String phoneNumber;
	private int seniority;

	
	
	public ShopAssistant(String Id, String name, String surname, String phoneNumber, int seniority) {
		this.Id = Id;
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.seniority = seniority;
		
	}
	public String toString() {
		
		return(name + " " + surname);
		
	}
	public int getSeniority() {
		return seniority;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getId() {
		return Id;
	}

}
