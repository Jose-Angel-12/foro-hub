package com.gelse.forohud.controller;

import com.gelse.forohud.topico.DatosRegistroTopico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topico")
public class TopicoController {

    @PostMapping
    public void registroTopico(@RequestBody DatosRegistroTopico datos){
        System.out.println(datos);
    }

}
