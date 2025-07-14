package com.gelse.forohud.controller;

import com.gelse.forohud.topico.DatosRegistroTopico;
import com.gelse.forohud.topico.Topico;
import com.gelse.forohud.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topico")
public class TopicoController {
    @Autowired
    private TopicoRepository repository;

    @Transactional
    @PostMapping
    public void registroTopico(@RequestBody DatosRegistroTopico datos) {
        repository.save(new Topico(datos));
    }

}
