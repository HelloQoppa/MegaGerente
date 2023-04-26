package com.qoppa.megagerente.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qoppa.megagerente.dtos.ProjetoDTO;
import com.qoppa.megagerente.models.Projeto;
import com.qoppa.megagerente.services.ProjetoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/projeto")
public class ProjetoController {

    final ProjetoService projetoService;

    public ProjetoController(ProjetoService projetoService) {
        this.projetoService = projetoService;
    }

    @GetMapping("/")
    public List<Projeto> getAllUsers() {
        return projetoService.findAll();
    }
    
    @PostMapping("/save")
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ProjetoDTO projetoDto) {
        var projetoModel = new Projeto();
        BeanUtils.copyProperties(projetoDto, projetoModel);
        projetoModel.setDataCriacao(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(projetoService.save(projetoModel));
    }
}