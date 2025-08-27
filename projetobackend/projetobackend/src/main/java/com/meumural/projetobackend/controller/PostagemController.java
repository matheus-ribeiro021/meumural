package com.meumural.projetobackend.controller;

import com.meumural.projetobackend.entity.Postagem;
import com.meumural.projetobackend.service.PostagemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/postagem")
@Tag(name = "postagem", description = "API para gerenciamento de postagens")
public class PostagemController {

    private final PostagemService postagemService;

    public PostagemController(PostagemService postagemService) {
        this.postagemService = postagemService;
    }

    @GetMapping("/listar")
    @Operation(summary = "listar postagens", description = "endpoint para listar todas as postagens")
    public ResponseEntity<List<Postagem>> listarPostagens() {
        return ResponseEntity.ok(postagemService.listarPostagens());
    }
}
