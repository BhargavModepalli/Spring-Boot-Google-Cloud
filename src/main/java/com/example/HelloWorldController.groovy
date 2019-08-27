package com.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/time")
    String getDate(){

        String time = new Date().toString()
        println("request came in at ${time}")
        return time
    }
}
