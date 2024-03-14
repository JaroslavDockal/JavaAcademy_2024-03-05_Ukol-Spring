package com.engeto.ja.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engeto.ja.spring.FileHandling;

@RestController
public class FileController {

    @GetMapping("scifi")
    public String scifi() {
        return FileHandling.loadFile("resources/scifi.txt");
    }

    @GetMapping("romantic")
    public String romantic() {
        return FileHandling.loadFile("resources/romantic.txt");
    }

    @GetMapping("historic ")
    public String historic () {
        return FileHandling.loadFile("resources/historic.txt");
    }

    @GetMapping("fantasy")
    public String fantasy() {
        return FileHandling.loadFile("resources/fantasy.txt");
    }

}
