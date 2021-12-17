package com.smallbaazaar.smallbaazaarapi.interfaces;

import com.smallbaazaar.smallbaazaarapi.entities.products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface productRepo extends JpaRepository<products,Integer> {

    @Query(value="select brand_name from products where prod_name=?",nativeQuery = true)
    public ArrayList<Object> findByName(String name);
}
