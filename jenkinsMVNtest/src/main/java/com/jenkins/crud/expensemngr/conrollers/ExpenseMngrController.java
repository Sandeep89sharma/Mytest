package com.jenkins.crud.expensemngr.conrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseMngrController {

    @GetMapping("/getExpense/{data}")
    public String getData(@PathVariable("data") String data)
    {
        return data;
    }
}
