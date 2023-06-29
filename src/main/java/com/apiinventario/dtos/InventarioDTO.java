package com.apiinventario.dtos;
import java.util.List;
import com.apiinventario.models.Activo;

public class InventarioDTO {
    private List<ActivoDTO> activos;

    public InventarioDTO() {
    }

    public InventarioDTO(List<ActivoDTO> activos) {
        this.activos = activos;
    }

    public List<ActivoDTO> getActivos() {
        return activos;
    }

    public void setActivos(List<ActivoDTO> activos) {
        this.activos = activos;
    }
}
