package com.delivery.api;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ClienteController {

    private List<Cliente> clientes = new ArrayList<>();
    private Long proximoId = 1L;

    @GetMapping("/clientes")
    public List<Cliente> ListaTodos(){
        return clientes;
    }

    @PostMapping("/clientes")
    public Cliente cadastrar(@RequestBody Cliente cliente){
        cliente.setId(proximoId);
        proximoId++;
        clientes.add(cliente);
        return  cliente;
    }
}





 