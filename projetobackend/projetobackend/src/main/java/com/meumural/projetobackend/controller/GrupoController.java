package com.meumural.projetobackend.controller;

import com.meumural.projetobackend.entity.Grupo;
import com.meumural.projetobackend.service.GrupoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/grupo")
@Tag(name = "grupo", description = "API para gerenciamento de grupos")
public class GrupoController {

    private final GrupoService grupoService;

    public GrupoController(GrupoService grupoService) {
        this.grupoService = grupoService;
    }

    @GetMapping("/listar")
    @Operation(summary = "listar grupos", description = "endpoint para listar todos os grupos")
    public ResponseEntity<List<Grupo>> listarGrupos() {
        return ResponseEntity.ok(grupoService.listarGrupos());
    }
}
