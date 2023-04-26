package com.qoppa.megagerente.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.qoppa.megagerente.services.AdministradorService;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {

    final AdministradorService admService;

    public AdministradorController(AdministradorService admService) {
        this.admService = admService;
    }

}
