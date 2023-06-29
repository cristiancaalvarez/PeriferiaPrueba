package com.apiinventario.repositories;

import com.apiinventario.dtos.ActivoDTO;
import com.apiinventario.dtos.InventarioDTO;
import com.apiinventario.models.Activo;
import com.apiinventario.models.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository  extends JpaRepository<Inventario, Long> { }

