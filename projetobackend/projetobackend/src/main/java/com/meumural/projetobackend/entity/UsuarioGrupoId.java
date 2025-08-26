package com.meumural.projetobackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsuarioGrupoId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "Usuario_grupo_id_usuario")
    private int usuarioId;

    @Column(name = "Usuario_grupo_id_grupo")
    private int grupoId;

    public UsuarioGrupoId() {
    }

    public UsuarioGrupoId(int usuarioId, int grupoId) {
        this.usuarioId = usuarioId;
        this.grupoId = grupoId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(int grupoId) {
        this.grupoId = grupoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioGrupoId)) return false;
        UsuarioGrupoId that = (UsuarioGrupoId) o;
        return usuarioId == that.usuarioId &&
                grupoId == that.grupoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuarioId, grupoId);
    }
}
