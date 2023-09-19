package com.example.CRUD_Vishal_Sir_Task2.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class HTMLController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Going home...");
        return "index";
    }
}
