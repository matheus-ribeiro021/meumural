package com.meumural.projetobackend.entity;


import jakarta.persistence.*;

import java.util.Set;
@Entity
@Table(name = "Arquivo_Postagem")
public class ArquivoPostagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Arquivo_id")
    private int id;

    @Column(name = "Arquivo_id_postagem")
    private int idPostagem; // você pode mudar para um relacionamento se tiver uma entidade "Postagem"

    @Column(name = "nome_arquivo", length = 100)
    private String nomeArquivo;

    @Column(name = "Arquivo_caminho", length = 255)
    private String caminho;

    @Column(name = "Arquivo_tipo", length = 50)
    private String tipo;

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPostagem() {
        return idPostagem;
    }

    public void setIdPostagem(int idPostagem) {
        this.idPostagem = idPostagem;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}