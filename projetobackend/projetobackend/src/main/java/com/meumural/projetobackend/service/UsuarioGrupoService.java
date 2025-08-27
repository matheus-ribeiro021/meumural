package com.meumural.projetobackend.service;

import com.meumural.projetobackend.entity.UsuarioGrupo;
import com.meumural.projetobackend.repository.UsuarioGrupoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioGrupoService {

    private final UsuarioGrupoRepository repository;

    public UsuarioGrupoService(UsuarioGrupoRepository repository) {
        this.repository = repository;
    }

    public List<UsuarioGrupo> listarUsuarioGrupos() {
        return repository.findAll();
    }
}
