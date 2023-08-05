package com.crud.api.controller;
import  org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import javax.naming.Name;

public record DadosUsuarios(String name,String email, String password) {

}
