package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "I have successfully built a Spring Boot application using Maven");
        model.addAttribute("msg", "This application is deployed onto Kubernetes using Argo CD");
        return "index";  // Make sure you have an 'index.html' in the 'src/main/resources/templates' folder
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
