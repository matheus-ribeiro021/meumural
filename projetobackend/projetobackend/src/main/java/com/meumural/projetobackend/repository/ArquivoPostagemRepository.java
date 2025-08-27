package com.meumural.projetobackend.repository;

import com.meumural.projetobackend.entity.ArquivoPostagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArquivoPostagemRepository extends JpaRepository<ArquivoPostagem, Integer> {
    // métodos customizados podem ser adicionados aqui
}
