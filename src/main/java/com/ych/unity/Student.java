package com.ych.unity;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

    @NotNull
    @Size(max = 10,min = 8)
    private String username;
    @NotNull
    @Size(max = 4,min = 2)
    private String firstName;
    @NotNull
    @Size(max = 12,min = 4)
    private String lastName;
    @NotNull
    @Size(min = 8)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
