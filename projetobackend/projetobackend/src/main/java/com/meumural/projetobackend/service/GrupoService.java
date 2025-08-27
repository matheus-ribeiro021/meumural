package com.meumural.projetobackend.service;

import com.meumural.projetobackend.entity.Grupo;
import com.meumural.projetobackend.repository.GrupoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoService {

    private final GrupoRepository repository;

    public GrupoService(GrupoRepository repository) {
        this.repository = repository;
    }

    public List<Grupo> listarGrupos() {
        return repository.findAll();
    }

    public Optional<Grupo> buscarPorId(int id) {
        return repository.findById(id);
    }

    public Grupo salvarGrupo(Grupo grupo) {
        // garante que o id não seja considerado na criação
        // (se sua entidade usar Integer id null para novo registro)
        return repository.save(grupo);
    }

    public Optional<Grupo> atualizarGrupo(int id, Grupo grupo) {
        if (!repository.existsById(id)) {
            return Optional.empty();
        }
        // assegura que vamos atualizar o registro existente com o id do path
        grupo.setId(id);
        Grupo atualizado = repository.save(grupo);
        return Optional.of(atualizado);
    }

    public boolean deletarGrupo(int id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
