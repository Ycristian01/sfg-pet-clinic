package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("Hello world");

        return "Hi Folks";
    }
}
