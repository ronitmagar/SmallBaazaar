package com.smallbaazaar.smallbaazaarapi.controllers;

import com.smallbaazaar.smallbaazaarapi.entities.products;
import com.smallbaazaar.smallbaazaarapi.services.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@Controller
public class productController {

    @Autowired
    productService service;

    /*@GetMapping("/products/name/{name}")
    public String getByName(@PathVariable String name, Model model)
    {
        ArrayList<Object> ref = service.getByName(name);
        model.addAttribute("data",ref);
        return "/category.html";
    }*/

    @RequestMapping("/products/name/{name}")
    //@ResponseBody
    public String getByName(@PathVariable("name") String name, Model model, HttpServletResponse response) throws IOException {
        ArrayList<Object> ref = service.getByName(name);
        //ModelAndView m = new ModelAndView("category");
        //m.addObject("data",ref);
        model.addAttribute("data",ref);
        //response.sendRedirect("category.html");
        //return m;
        return "/category.html";
    }
}
