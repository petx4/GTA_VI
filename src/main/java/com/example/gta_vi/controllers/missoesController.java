package com.example.gta_vi.controllers;

import com.example.gta_vi.entities.Missoes;
import com.example.gta_vi.service.MissoesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/missoes")
public class missoesController {

    private final MissoesService missoesService;

    public missoesController(MissoesService missoesService){
        this.missoesService = missoesService;
    }

    @PostMapping
    public void criarMissoes(@RequestBody Missoes missoes){
        missoesService.cadastrarMissoes(missoes);
    }

    @GetMapping
    public List<Missoes> listarMissoes(){
        return missoesService.listarMissoes();
    }

    @DeleteMapping("/{id}")
    public void deletarMissoes(@PathVariable int id){
        missoesService.deletarMissoes(id);
    }

    @PutMapping("/{id}")
    public void alterarMissoes(@PathVariable int id, @RequestBody Missoes missoes){
        missoesService.alterarMissao(id, missoes);
    }
}
