package com.ecommerce.shop.web.controller;

import com.ecommerce.shop.data.model.Product;
import com.ecommerce.shop.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProductServices productServicesImpl;

    @GetMapping("/index")
    public String getIndex(Model model){
        List<Product> productList = productServicesImpl.findAll();
        model.addAttribute("products", productList);
        return "index";
    }

    @GetMapping("/about")
    public String getAbout(){
        return "about";
    }
    @GetMapping("/contact")
    public String getContact(){
        return "contact";
    }
    @GetMapping("/product")
    public String getProduct(){
        return "product";
    }
    @GetMapping("/services")
    public String getServices(){
        return "services";
    }
    @GetMapping("/single")
    public String getSingle(){
        return "single";
    }

}
