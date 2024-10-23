package org.example.SingleResponsibilityPrinciple;

public class Marker {
    private String color;
    private String name;
    private int year;
    private int price;

    public Marker(String color, String name, int year, int price){
        this.color = color;
        this.name =name;
        this.year=year;
        this.price=price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
