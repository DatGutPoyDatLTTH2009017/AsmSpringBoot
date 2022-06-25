package com.example.asmspringboot.repository;

import com.example.asmspringboot.entity.Districts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictsRepository extends JpaRepository<Districts, Integer> {
}
