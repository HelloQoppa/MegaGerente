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

import com.qoppa.megaagerente.Interfaces.IAdministradorService;
import com.qoppa.megaagerente.models.Administrador;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {

    final private IAdministradorService administradorService;

    AdministradorController(IAdministradorService administradorService) {
        this.administradorService = administradorService;
    }

    @GetMapping
    public List<Administrador> listar() {
        return administradorService.findAll();
    }

    @GetMapping("/{id}")
    public Administrador buscar(@PathVariable Long id) {
        return (Administrador) administradorService.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Administrador cadastrar(@RequestBody Administrador administrador) {
        return (Administrador) administradorService.save(administrador);
    }

    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Administrador atualizar(@PathVariable Long id, @RequestBody Administrador administrador) {
        administrador.setId(id);
        return (Administrador) administradorService.save(administrador);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id) {
        administradorService.deleteById(id);
    }

}
