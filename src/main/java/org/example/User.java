package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {
    private long id;
    private String surname;
    private String name;
    private String middlename;
    private int phoneNumber;
    private String address;
    @Override
    public String toString() {
        return this.surname + " " + this.name + " " + this.middlename + " " + this.phoneNumber + " " + this.address;
    }
}
