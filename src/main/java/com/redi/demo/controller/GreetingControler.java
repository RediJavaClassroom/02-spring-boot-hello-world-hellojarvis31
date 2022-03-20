package com.redi.demo.controller;

import com.redi.demo.domain.Greeting;
import com.redi.demo.domain.GreetingStatistics;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;

//Every method of this class will take http input
@RestController
//@RequestMapping("api")
public class GreetingControler {

    @GetMapping("greeting") // with and without slash will work...!
    public ArrayList greet(@RequestParam(value = "my_name", defaultValue = "World") String name)
    {
        String content = "Hello " + name + "!";
        return GreetingStatistics.getGreetingStatistics(content);
    }
}
