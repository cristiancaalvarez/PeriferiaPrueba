package com.apiinventario.services;

import com.apiinventario.dtos.InventarioDTO;
import com.apiinventario.models.Inventario;
import com.apiinventario.repositories.InventarioRepository;
import org.springframework.stereotype.Service;

@Service
public class InventarioService {
private InventarioRepository repository;

   @Override
   public Inventario guardarInventario(InventarioDTO inventario){
       return this.repository.save(inventario);
   }

}
