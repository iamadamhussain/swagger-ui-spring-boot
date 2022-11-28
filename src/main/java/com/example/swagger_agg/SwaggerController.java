package com.example.swagger_agg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SwaggerController  {
    @GetMapping(path = "/swagger")
    public String redirectToSwagger() {
        return "redirect:/swagger-ui.html";
    }

}
