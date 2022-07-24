package edu.intellistart;

public class Buyer {
    private final int id;
    private String firstName;
    private String lastName;
    private int amountOfMoney;

    @Override
    public String toString() {
        String result = "Id:" + id + " FirstName:" + firstName + " LastName:" + lastName + " AmountOfMoney:" + amountOfMoney;
        return result;
    }

    public int getId() {
        return id;
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

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public Buyer(int id, String lastName, String firstName, int amountOfMoney) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amountOfMoney = amountOfMoney;
    }
}
