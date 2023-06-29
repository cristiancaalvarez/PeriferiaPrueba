package com.apiinventario.controllers;
import com.apiinventario.dtos.InventarioDTO;
import com.apiinventario.repositories.InventarioRepository;
import com.apiinventario.services.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/api/inventario")
public class InventarioController {
    @Autowired
    private InventarioRepository repository;
    private InventarioService services;

    @PostMapping
    public ResponseEntity<InventarioDTO> registrarActivo(@RequestBody InventarioDTO inventarioDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(inventarioDto);

    }
}
