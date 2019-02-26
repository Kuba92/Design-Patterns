package co.devfoundry.designpatterns.adapter;

import java.time.LocalDate;

public class User {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String PESEL;

    public User(String firstName, String lastName, String PESEL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.PESEL = PESEL;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPESEL() {
        return PESEL;
    }
}
