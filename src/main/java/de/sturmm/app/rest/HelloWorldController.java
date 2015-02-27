package de.sturmm.app.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sturmm on 27.02.15.
 */
@RestController
@RequestMapping("/app")
public class HelloWorldController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

}
