package com.meumural.projetobackend.controller;

import com.meumural.projetobackend.entity.ArquivoPostagem;
import com.meumural.projetobackend.service.ArquivoPostagemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/arquivo-postagem")
@Tag(name = "arquivo-postagem", description = "API para gerenciamento de arquivos das postagens")
public class ArquivoPostagemController {

    private final ArquivoPostagemService arquivoService;

    public ArquivoPostagemController(ArquivoPostagemService arquivoService) {
        this.arquivoService = arquivoService;
    }

    @GetMapping("/listar")
    @Operation(summary = "listar arquivos", description = "endpoint para listar arquivos das postagens")
    public ResponseEntity<List<ArquivoPostagem>> listarArquivos() {
        return ResponseEntity.ok(arquivoService.listarArquivos());
    }
}
