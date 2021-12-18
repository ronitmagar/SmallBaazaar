package com.smallbaazaar.smallbaazaarapi.services;

import com.smallbaazaar.smallbaazaarapi.entities.products;
import com.smallbaazaar.smallbaazaarapi.interfaces.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class productService {

    @Autowired
    productRepo repo;


    public ArrayList<Object> getByName(String name) {
        return repo.findByName(name);
    }

    public ArrayList<products> getAll() {
        return (ArrayList<products>) repo.findAll();
    }

    public ArrayList<products> getByPrice(String brand, String globalname) {
        return repo.findByPrice(brand,globalname);
    }



    /*public ArrayList<products> getByName() {
        return repo.findByName();
    }*/
}
