package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.org.hw.HelloWorldService;

@Controller
@RequestMapping("/echo.html")
public class EchoController {

    @Autowired
    private HelloWorldService service;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String handleGet() {
        return service.echo("It workzzzzz!");
    }
}
