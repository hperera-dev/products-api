package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")
    public String info() { return "This is a foundational Spring Boot REST API which includes a few basic controller endpoints, system status reporting and basic object oriented programming."; }
}