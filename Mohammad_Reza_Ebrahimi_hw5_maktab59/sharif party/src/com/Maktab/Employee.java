package com.Maktab;

public class Employee {
    private int id;
    private String name;
    private String family;
    private String gender;
    private Location location;
    private Employee spouse;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", gender='" + gender + '\'' +
                ", location=" + location +
                ", spouse=" + spouse.getName()+" " +spouse.getFamily()+" "+spouse.getGender()+
                '}';
    }

    public Employee(int id, String name, String family, String gender, Location location) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.gender = gender;
        this.location = location;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Employee getSpouse() {
        return spouse;
    }

    public void setSpouse(Employee spouse) {
        this.spouse = spouse;
    }

    public boolean isMarried() {
        return spouse != null;
    }
}

