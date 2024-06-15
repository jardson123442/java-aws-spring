package br.com.erudio.javaawsspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private static AtomicLong counter = new AtomicLong(); //Gerar ID

    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "Word")
            String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name)); //counter.incrementAndGet() = gerar um ID maior a cada chamada
    }
}
