package com.seb;

public class ProductApp {

    public static void main(String[] args) {

        Product p = new Product();
        p.setCode(("Java"));
        p.setDescription("It has so many features");
        p.setPrice(50.0);
        System.out.println(p.getCode());
        System.out.println(p.getDescription());
        System.out.println(p.getPrice());

        Software so = new Software();
        so.setPlatform("Mac");
        so.setDescription("Expensive");
        so.setPrice(90.0);
        System.out.println(so.getPlatform());
        System.out.println(so.getDescription());
        System.out.println(so.getPrice());
        System.out.println(so.getProgrammer());
        System.out.println(so.getOS());
    }
}
