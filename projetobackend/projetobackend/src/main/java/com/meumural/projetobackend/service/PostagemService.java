package com.meumural.projetobackend.service;

import com.meumural.projetobackend.entity.Postagem;
import com.meumural.projetobackend.repository.PostagemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostagemService {

    private final PostagemRepository repository;

    public PostagemService(PostagemRepository repository) {
        this.repository = repository;
    }

    public List<Postagem> listarPostagens() {
        return repository.findAll();
    }

    // depois você pode adicionar salvar, buscarPorId, etc.
}
