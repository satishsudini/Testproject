package com.satish.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.*;
import java.util.*;


@RestController
public class Ticket_reserve {

    @RequestMapping(value = "hello/{name}")
    public String greetWorld(@PathVariable String name) {
        return "Hello! "+ name;
    }

}