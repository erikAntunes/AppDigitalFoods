package com.example.digitalhousefoods.entidades;

import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class Restaurante implements Serializable {

    private int imageRestaurant;
    private String nameRestaurant;
    private String addressRestaurant;
    private String closeRestaurant;

    public int getImageRestaurant() {
        return imageRestaurant;
    }

    public void setImageRestaurant(int imageRestaurant) {
        this.imageRestaurant = imageRestaurant;
    }

    public String getNameRestaurant() {
        return nameRestaurant;
    }

    public void setNameRestaurant(String nameRestaurant) {
        this.nameRestaurant = nameRestaurant;
    }

    public String getAddressRestaurant() {
        return addressRestaurant;
    }

    public void setAddressRestaurant(String addressRestaurant) {
        this.addressRestaurant = addressRestaurant;
    }

    public String getCloseRestaurant() {
        return closeRestaurant;
    }

    public void setCloseRestaurant(String closeRestaurant) {
        this.closeRestaurant = closeRestaurant;
    }
}