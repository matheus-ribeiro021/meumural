package com.meumural.projetobackend.service;

import com.meumural.projetobackend.entity.ArquivoPostagem;
import com.meumural.projetobackend.repository.ArquivoPostagemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArquivoPostagemService {

    private final ArquivoPostagemRepository repository;

    public ArquivoPostagemService(ArquivoPostagemRepository repository) {
        this.repository = repository;
    }

    public List<ArquivoPostagem> listarArquivos() {
        return repository.findAll();
    }

    // você pode adicionar outros métodos aqui depois (salvar, buscarPorId etc.)
}
