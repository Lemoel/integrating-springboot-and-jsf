package com.example.integratingspringbootandjsf.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClientesResource {

    @GetMapping
    public String listar() {
        return "teste";
    }
}
