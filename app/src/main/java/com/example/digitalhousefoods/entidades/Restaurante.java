package com.example.digitalhousefoods.entidades;

import android.widget.ImageView;
import android.widget.TextView;

import com.example.digitalhousefoods.adapters.DetalheAdapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Restaurante implements Serializable {

    private int imageRestaurant;
    private String nameRestaurant;
    private String addressRestaurant;
    private String closeRestaurant;
    private List<Pratos> listaDePratos = new ArrayList<>();

    public List<Pratos> getListaDePratos() {
        return listaDePratos;
    }

    public void setListaDePratos(List<Pratos> listaDePratos) {
        this.listaDePratos = listaDePratos;
    }

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