package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonController {

    @RequestMapping("/info")
    public String getInfo(){
        return "information";
//        return "Response from Person Controller";
    }
}
