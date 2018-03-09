package carnet;

import javafx.beans.property.SimpleStringProperty;

public class PersonEntry {
	 
    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty email;
    private final SimpleStringProperty telephoneNb;
    private final SimpleStringProperty address;

    PersonEntry(String fName, String lName, String email, String telephoneNb, String address) {
        this.firstName = new SimpleStringProperty(fName);
        this.lastName = new SimpleStringProperty(lName);
        this.email = new SimpleStringProperty(email);
        this.telephoneNb = new SimpleStringProperty(telephoneNb);
        this.address = new SimpleStringProperty(address);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String fName) {
        firstName.set(fName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String fName) {
        lastName.set(fName);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String fName) {
        email.set(fName);
    }

	public String getTelephoneNb() {
		return telephoneNb.get();
	}

	public String getAddress() {
		return address.get();
	}
  
}
