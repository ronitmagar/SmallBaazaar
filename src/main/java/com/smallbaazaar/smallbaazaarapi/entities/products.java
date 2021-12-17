package com.smallbaazaar.smallbaazaarapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="products")
public class products {

    @Id
    @Column(name="prod_id")
    int id;
    @Column(name="brand_name")
    String brand;
    @Column(name="price")
    float price;
    @Column(name="prod_name")
    String name;

    public products(){

    }
    public products(int id, String brand, float price, String name) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
