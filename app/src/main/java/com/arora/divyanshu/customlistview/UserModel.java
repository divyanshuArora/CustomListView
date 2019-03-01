package com.arora.divyanshu.customlistview;

public class UserModel {

    private  String name;
    private  String email;

    public UserModel(String name, String email, int img) {
        this.name = name;
        this.email = email;
        this.img=img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    private  int img;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
