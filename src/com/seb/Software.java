package com.seb;

public class Software extends Product {

    private String programmer;
    private String platform;
    private String os;

    //a software constructor
    public Software(){
        super();
        System.out.println("This is a software ");
    }

    public String Software(String coder){
        this.programmer = coder;
        return "This is the overloaded constructor";
    }

    public void setProgrammer(String coder1){
        this.programmer = coder1;
    }

    public String getProgrammer(){
        return programmer;
    }

    public void setPlatform(String stage){
        this.platform = stage;
    }

    public String getPlatform(){
        return platform;
    }

    public void setOS(String os1){
        this.os = os1;
    }

    public String getOS(){
        return os;
    }
}
