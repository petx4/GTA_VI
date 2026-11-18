package com.example.gta_vi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Missoes {
    @Id
    @GeneratedValue

    private int id;
    private String nomeMissao;
    private String local;
    private String dificuldade;
    private String descricaoMissao;
    private String imagemMissao;

    public Missoes() {
    }

    public Missoes(String nomeMissao, String local, String dificuldade, String descricaoMissao, String imagemMissao) {
        this.nomeMissao = nomeMissao;
        this.local = local;
        this.dificuldade = dificuldade;
        this.descricaoMissao = descricaoMissao;
        this.imagemMissao = imagemMissao;
    }

    public Missoes(int id, String nomeMissao, String local, String dificuldade, String descricaoMissao, String imagemMissao) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        this.local = local;
        this.dificuldade = dificuldade;
        this.descricaoMissao = descricaoMissao;
        this.imagemMissao = imagemMissao;
    }

    public int getId() {
        return id;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public String getLocal() {
        return local;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public String getDescricaoMissao() {
        return descricaoMissao;
    }

    public String getImagemMissao() {
        return imagemMissao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void setDescricaoMissao(String descricaoMissao) {
        this.descricaoMissao = descricaoMissao;
    }

    public void setImagemMissao(String imagemMissao) {
        this.imagemMissao = imagemMissao;
    }
}
