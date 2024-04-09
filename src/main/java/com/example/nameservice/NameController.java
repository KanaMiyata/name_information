package com.example.nameservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {
    private final NameService nameService;

    public NameController(NameService nameService){
        this.nameService=nameService;
    }

    @GetMapping("/names/{id}")
    public Name getName(@PathVariable("id") int id) {
        return nameService.findName(id);
    }

}



