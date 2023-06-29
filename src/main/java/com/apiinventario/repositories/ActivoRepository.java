package com.apiinventario.repositories;

import com.apiinventario.models.Activo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivoRepository extends JpaRepository<Activo, Long> {
}
