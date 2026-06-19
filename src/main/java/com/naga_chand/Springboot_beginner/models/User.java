package com.naga_chand.Springboot_beginner.models;

public class User {

    private int id;
    private String name;
    private String gender;
    private String image;

    public User(){

    }

    public User(int id,String name,String gender, String image){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.image = image;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return this.gender;
    }

    public void setImage(String image){
        this.image = image;
    }
    public String getImage(){
        return this.image;
    }

    
}
