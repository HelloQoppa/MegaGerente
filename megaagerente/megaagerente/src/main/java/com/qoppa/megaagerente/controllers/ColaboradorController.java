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

import com.qoppa.megaagerente.Interfaces.IColaboradorService;
import com.qoppa.megaagerente.models.Colaborador;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorController {

    final private IColaboradorService colaboradorService;

    public ColaboradorController(IColaboradorService colaboradorService) {
        this.colaboradorService = colaboradorService;
    }

    @GetMapping
    public List<Colaborador> listar() {
        return colaboradorService.findAll();
    }

    @GetMapping("/{id}")
    public Colaborador buscar(@PathVariable Long id) {
        return (Colaborador) colaboradorService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Colaborador cadastrar(@RequestBody Colaborador colaborador) {
        return (Colaborador) colaboradorService.save(colaborador);

    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Colaborador atualizar(@PathVariable Long id, @RequestBody Colaborador colaborador) {
        colaborador.setId(id);
        return (Colaborador) colaboradorService.save(colaborador);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id) {
        colaboradorService.deleteById(id);
    }
}
