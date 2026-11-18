package com.example.gta_vi.service;

import com.example.gta_vi.entities.Missoes;
import com.example.gta_vi.repositories.missoesRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    private final missoesRepository repo;

    public MissoesService(missoesRepository repo){
        this.repo = repo;
    }

    public void cadastrarMissoes(Missoes m){
        repo.save(m);
    }
    public List<Missoes> listarMissoes(){
        return repo.findAll();
    }
    public void deletarMissoes(int id){
        repo.deleteById(id);
    }
    @Transactional
    public void alterarMissao(int id, Missoes missoes){
        Missoes m = repo.getReferenceById(id);
        m.setNomeMissao(missoes.getNomeMissao());
        m.setLocal(missoes.getLocal());
        m.setDificuldade(missoes.getDificuldade());
        m.setImagemMissao(missoes.getImagemMissao());
        m.setDescricaoMissao(missoes.getDescricaoMissao());
    }
}
