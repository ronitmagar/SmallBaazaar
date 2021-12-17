package com.smallbaazaar.smallbaazaarapi.services;

import com.smallbaazaar.smallbaazaarapi.entities.products;
import com.smallbaazaar.smallbaazaarapi.interfaces.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class productService {

    @Autowired
    productRepo repo;

    public ArrayList<Object> getByName(String name)
    {
        return repo.findByName(name);
    }
}
