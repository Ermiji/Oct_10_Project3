package com.seb;

public class Book extends Product{
    private String author;
    private int pages;

    //a book constructor
    public Book(){
        super();
        System.out.println("This is a book");
    }

    //an overloaded constructor
    public String Book(String name){
        this.author = name;
        return "This is the overloaded construtor";
    }

    public void setAuthor(String name){
        this.author = name;
    }

    public String getAuthor(){
        return author;
    }

    public void setPages(Integer num){
        this.pages = num;
    }

    public Integer getPages(){
        return pages;
    }
}
