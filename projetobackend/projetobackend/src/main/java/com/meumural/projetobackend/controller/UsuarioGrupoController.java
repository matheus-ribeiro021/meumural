package com.meumural.projetobackend.controller;

import com.meumural.projetobackend.entity.UsuarioGrupo;
import com.meumural.projetobackend.service.UsuarioGrupoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/usuario-grupo")
@Tag(name = "usuario-grupo", description = "API para relacionamento usuario <-> grupo")
public class UsuarioGrupoController {

    private final UsuarioGrupoService usuarioGrupoService;

    public UsuarioGrupoController(UsuarioGrupoService usuarioGrupoService) {
        this.usuarioGrupoService = usuarioGrupoService;
    }

    @GetMapping("/listar")
    @Operation(summary = "listar usuario-grupos", description = "endpoint para listar relacionamentos usuario-grupo")
    public ResponseEntity<List<UsuarioGrupo>> listar() {
        return ResponseEntity.ok(usuarioGrupoService.listarUsuarioGrupos());
    }
}
