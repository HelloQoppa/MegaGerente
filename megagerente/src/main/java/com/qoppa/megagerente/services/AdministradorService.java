package com.qoppa.megagerente.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qoppa.megagerente.repositories.AdministradorRepoitory;


@Service
public class AdministradorService {

    @Autowired
    private AdministradorRepoitory administradorRepoitory;

    public AdministradorService(AdministradorRepoitory administradorRepoitory) {
        this.administradorRepoitory = administradorRepoitory;
    }
}
