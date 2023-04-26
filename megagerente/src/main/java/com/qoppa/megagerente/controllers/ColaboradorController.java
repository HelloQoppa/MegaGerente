package com.qoppa.megagerente.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qoppa.megagerente.services.ColaboradorService;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorController {

    final ColaboradorService colaboradorService;

    public ColaboradorController(ColaboradorService colaboradorService) {
        this.colaboradorService = colaboradorService;
    }
}
