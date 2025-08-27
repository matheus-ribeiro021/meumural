package com.meumural.projetobackend.repository;

import com.meumural.projetobackend.entity.UsuarioGrupo;
import com.meumural.projetobackend.entity.UsuarioGrupoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioGrupoRepository extends JpaRepository<UsuarioGrupo, UsuarioGrupoId> {
    // consultas customizadas para relacionamento usuario-grupo aqui
}
