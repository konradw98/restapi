package pl.nullpointerexception.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.nullpointerexception.restapi.service.HelloService;

@RestController
@RequiredArgsConstructor
public class HelloController {


    private final HelloService helloService;

    //zeby usunac bledy odkomentuj ponizszy konktruktor
    /*public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }*/

    @GetMapping("/")
    public String hello(){
        return helloService.hello();
    }
}
