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

    public ArrayList<Object> getByName(String name)
    {
        return repo.findByName(name);
    }

    public ArrayList<Object> getByPrice(String brand,String name) {
        return repo.findByPrice(brand,name);
    }

    public List<products> getAll() {
        return repo.find();
    }
}
