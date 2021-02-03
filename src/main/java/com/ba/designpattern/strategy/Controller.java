package com.ba.designpattern.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private DBService dbService;

    @GetMapping("/select")
    public void select() {
        dbService.select();
    }

    @GetMapping("/update")
    public void update() {
        dbService.update();
    }

    @GetMapping("/delete")
    public void delete() {
        dbService.delete();
    }

    @GetMapping("/insert")
    public void insert() {
        dbService.insert();
    }
}
