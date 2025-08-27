package com.meumural.projetobackend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "UsuarioGrupo")
public class UsuarioGrupo {

    @EmbeddedId
    private UsuarioGrupoId id;

    @ManyToOne
    @MapsId("usuarioId")
    @JoinColumn(name = "Usuario_grupo_id_usuario")
    private Usuario usuario;

    @ManyToOne
    @MapsId("grupoId")
    @JoinColumn(name = "Usuario_grupo_id_grupo")
    private Grupo grupo;

    @Column(name = "Usuario_grupo_data_entrada")
    private LocalDateTime dataEntrada;

    public UsuarioGrupo() {}

    public UsuarioGrupo(Usuario usuario, Grupo grupo, LocalDateTime dataEntrada) {
        this.id = new UsuarioGrupoId(usuario.getId(), grupo.getId());
        this.usuario = usuario;
        this.grupo = grupo;
        this.dataEntrada = dataEntrada;
    }
