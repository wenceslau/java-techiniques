package br.com.ada.files;

import java.time.LocalDate;

public class Employee {

    private String name;
    private String city;
    private boolean marriage;
    private LocalDate birthday;

    public Employee(String name, String city, boolean marriage, LocalDate birthday) {
        this.name = name;
        this.city = city;
        this.marriage = marriage;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isMarriage() {
        return marriage;
    }

    public void setMarriage(boolean marriage) {
        this.marriage = marriage;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name ='" + name + "'" +
                ", city='" + city + '\'' +
                ", marriage=" + marriage +
                ", birthday=" + birthday +
                '}';
    }
}
