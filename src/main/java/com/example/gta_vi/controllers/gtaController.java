package com.example.gta_vi.controllers;
import com.example.gta_vi.entities.Personagens;
import com.example.gta_vi.service.PersonagensService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personagens")
public class gtaController {

    private final PersonagensService personagensService;

    public gtaController(PersonagensService personagensService) {
        this.personagensService = personagensService;
    }

    @PostMapping
    public void criarPersonagens(@RequestBody Personagens perso) {
        personagensService.cadastrar(perso);
    }

    @GetMapping
    public List<Personagens> mostrarPersonagens() {
        return personagensService.listar();
    }
    @DeleteMapping("/{id}")
public void deletar(@PathVariable int id) {
        personagensService.deletar(id);
    }

    @PutMapping
    public void alterar(int id, Personagens perso){
        personagensService.alterar(id,perso);
    }
}