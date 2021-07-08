package com.pustakari.pustakarionlineshopping.controller;

//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WebInfoController {

    @GetMapping("/home")
    public String getHomePage(){
        return ("This is a home page");
    }

    @GetMapping("/admin")
    public String getAdminPage(){
        return ("This is an admin page");
    }
    @GetMapping("/user")
    public String getUserPage(){
        return ("This is a user page");
    }

    @GetMapping("/manager")
    public String getManagerPage(){
        return ("This is a manager page");
    }

    @GetMapping("/welcome")
    public String getWelcomePage(){
        return ("This is the welcome page");
    }



}
