package com.s4s.charity.voteregistrationsvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
@RequestMapping("/")
@Slf4j
public class DemoController {

    @GetMapping("/sayHello")
    public String sayHello() {

        log.info("within DemoController.sayHello");
        String msg = "Hello " + UUID.randomUUID() + "!!! How are you?? I am from registration-svc";
        log.info("msg :: ", msg);
        return msg;
    }

    @RequestMapping("/index")
    public String loadIndexPage() {
        log.info("within loadIndexPage...");
        return "index.html";
    }
}
