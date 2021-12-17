package com.smallbaazaar.smallbaazaarapi.controllers;

import com.smallbaazaar.smallbaazaarapi.entities.products;
import com.smallbaazaar.smallbaazaarapi.services.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class productController {

    //String globalname = "";

    @Autowired
    productService service;

    @GetMapping("/products")
    public String getAllProducts(Model model)
    {
        List<products> ref = service.getAll();
        model.addAttribute("data",ref);
        return "/all.html";
    }

    @GetMapping("/products/{name}")
    //@ResponseBody
    public String getByName(@PathVariable("name") String name, Model model) throws IOException {
        //globalname = name;
        ArrayList<Object> ref = service.getByName(name);
        //ModelAndView m = new ModelAndView("category");
        //m.addObject("data",ref);
        model.addAttribute("data",ref);
        //response.sendRedirect("category.html");
        //return m;
        return "/category.html";
    }
    /*@GetMapping("/products/price")
    public String getByBrand(@RequestParam(name="val") String brand,Model model){
        ArrayList<Object> ref = service.getByPrice(brand,globalname);
        System.out.println("Global name: "+globalname);
        model.addAttribute("data",ref);
        //System.out.println(brand);
        //return "brand : "+ brand;
        return "/next.html";
    }*/
}
