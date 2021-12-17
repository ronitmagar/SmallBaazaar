package com.smallbaazaar.smallbaazaarapi.interfaces;

import com.smallbaazaar.smallbaazaarapi.entities.products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface productRepo extends JpaRepository<products,Integer> {

    @Query(value = "select brand_name from products where prod_name=?", nativeQuery = true)
    public ArrayList<Object> findByName(String name);

    /*@Query(value = "select distinct prod_name from products",nativeQuery = true)
    ArrayList<products> findByName();*/

   /* @Query(value="select * from products where brand_name=? and prod_name=?",nativeQuery = true)
    public ArrayList<Object> findByPrice(String brand,String name);*/

}