package com.example.gta_vi.repositories;

import com.example.gta_vi.entities.Personagens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface gtaRepository extends JpaRepository<Personagens, Integer> {
}
