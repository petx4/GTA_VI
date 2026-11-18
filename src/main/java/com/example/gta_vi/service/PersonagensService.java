package com.example.gta_vi.service;

import com.example.gta_vi.entities.Personagens;
import com.example.gta_vi.repositories.gtaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagensService {

    private final gtaRepository repo;

    public PersonagensService(gtaRepository repo) {
        this.repo = repo;
    }

    public void cadastrar(Personagens p) {
        repo.save(p);
    }

    public List<Personagens> listar() {
        return repo.findAll();
    }

    public void deletar(int id){
        repo.deleteById(id);
    }

    @Transactional
    public void alterar(int id, Personagens personagens){
        Personagens p = repo.getReferenceById(id);
        p.setNome(p.getNome());
        p.setApelido(p.getApelido());
        p.setCategoria(p.getCategoria());
        p.setDescricao(p.getDescricao());
    }
}