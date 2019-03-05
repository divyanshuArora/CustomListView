package com.arora.divyanshu.customlistview;

public class UserModel {

    private  String name;
    private  String email;
    private String days;
    private String views;
    private int flag;

    public UserModel(String days, String views, String travel, int imageChat) {


        this.days = days;
        this.views = views;
        this.travel = travel;
        this.ImageChat = imageChat;


    }

    public UserModel(int img) {
        this.img = img;

    }


    public String getTravel() {
        return travel;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }


    private String travel;

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public int getImageChat() {
        return ImageChat;
    }

    public void setImageChat(int imageChat) {
        ImageChat = imageChat;
    }

    private int ImageChat;

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
