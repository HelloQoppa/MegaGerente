package com.qoppa.megaagerente.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.qoppa.megaagerente.Interfaces.IProjetoService;
import com.qoppa.megaagerente.models.Projeto;

@RestController
@RequestMapping("/projeto")
public class ProjetoController {

    final private IProjetoService<Projeto> projetoService;

    ProjetoController(IProjetoService projetoService) {
        this.projetoService = projetoService;
    }

    @GetMapping
    public List<Projeto> listar() {
        return projetoService.findAll();
    }

    @GetMapping("/{id}")
    public Projeto buscar(@PathVariable Long id) {
        return projetoService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Projeto cadastrar(@RequestBody Projeto projeto) {
        // var projetoModel = new Projeto();
        // projetoModel.setDataCriacao(java.time.LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
        return projetoService.save(projeto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Projeto atualizar(@PathVariable Long id, @RequestBody Projeto projeto) {
        projeto.setId(id);
        return projetoService.save(projeto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id) {
        projetoService.deleteById(id);
    }
}
