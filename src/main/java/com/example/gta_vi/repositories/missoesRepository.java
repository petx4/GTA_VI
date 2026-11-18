package com.example.gta_vi.repositories;

import com.example.gta_vi.entities.Missoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface missoesRepository extends JpaRepository<Missoes, Integer> {
}
