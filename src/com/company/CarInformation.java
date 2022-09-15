package com.company;

public class CarInformation {
    private int yearOfIssue;
    private String model;
    private int prise;
    private String color;

    public CarInformation(int yearOfIssue, String model, int prise, String color) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.prise = prise;
        this.color = color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarInformation{" +
                "yearOfIssue=" + yearOfIssue +
                ", model='" + model + '\'' +
                ", prise=" + prise +
                ", color='" + color + '\'' +
                '}';
    }
}
