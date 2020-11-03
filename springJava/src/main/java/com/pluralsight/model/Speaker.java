package com.pluralsight.model;

public class Speaker {
    private String firstName;
    private String lastName;
    private double seedNum;

    public String getFirstName() {
        //System.out.println("Entered getFirstName in Speaker...");
        return firstName;
    }

    public void setFirstName(String firstName) {
        //System.out.println("Entered setFirstName in Speaker...");
        this.firstName = firstName;
    }

    public String getLastName() {
        //System.out.println("Entered getLastName in Speaker...");
        return lastName;
    }

    public void setLastName(String lastName) {
        //System.out.println("Entered setLastName in Speaker...");
        this.lastName = lastName;
    }

    public double getSeedNum() {
        return seedNum;
    }

    public void setSeedNum(double seedNum) {
        this.seedNum = seedNum;
    }
}
