package com.ecomindo.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InputForm {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
    private String content;
    
    private String firstName;
    private String lastName;

    protected InputForm() {}

    public InputForm(long id, String content, String firstName, String lastName) {
        this.id = id;
        this.content = content;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    
    @Override
    public String toString() {
        return String.format(
                "InputForm[id=%d, content='%s', firstName='%s', lastName='%s']",
                id, content, firstName, lastName);
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

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	

}
