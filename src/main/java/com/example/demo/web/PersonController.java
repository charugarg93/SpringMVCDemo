package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class PersonController {

    @RequestMapping("/info")
    public String getInfo(Model model){
        model.addAttribute("message", new Date().toString());
        return "information";

    }
}
