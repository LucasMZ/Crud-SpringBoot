package com.crud.api.controller;
import  org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
@RequestMapping("/users")
public class Users {
    @PostMapping
    public void cadastrarUsers(@RequestBody DadosUsuarios dados){
    System.out.println(dados);
    }
}
