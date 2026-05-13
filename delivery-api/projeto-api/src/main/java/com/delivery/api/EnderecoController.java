package com.delivery.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EnderecoController {
    private List<Endereco> enderecos = new ArrayList<>();
    private Long proximoId = 1L;

    @GetMapping("/enderecos")
    public List<Endereco> ListaTodos(){
        return enderecos;
    }

    @PostMapping("/enderecos")
    public Endereco cadastrar(@RequestBody Endereco endereco){
        endereco.setId(proximoId);
        proximoId++;
        enderecos.add(endereco);
        return  endereco;
    }
}





