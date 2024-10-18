package com.example.core.repository;


import com.example.core.domain.Permisos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermisosRepository extends JpaRepository<Permisos,Long> {}
