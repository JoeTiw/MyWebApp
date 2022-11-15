package com.mycompany;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Controller
public class MainController {
    @GetMapping("")
    public String showHomePage(){

        return "index";
    }


}
