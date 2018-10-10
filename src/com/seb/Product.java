package com.seb;

public class Product {

    private String code;
    private String description;
    private double price;
    protected  static int count = 0; //a protected static variable

    public Product(){
        code = "";
        description = "";
        price = 0;
    }

    //Get and set accessors for the code, description,
    //and price instance variables

    public void setCode(String code1){
        this.code = code1;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description1){
        this.description = description1;
    }

    public String getDescription(){
        return description;
    }

    public void setPrice(Double cost){
        this.price = cost;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Code:\t " + code + "\n" +
               "Description:\t" + description + "\n" +
               "Price:\t " + this.getFormatedPrice() + "\n";
    }

    private String getFormatedPrice(){
        return String.format("$%2f", price);
    }

    //Create public access for the count variable
    public static int getCount(){
        return count;
    }
}
