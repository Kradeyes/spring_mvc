package com.romanyanin.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }
}
