package com.universidad.productosweb.service;

import org.springframework.stereotype.Service;
import com.universidad.productosweb.model.Producto;
import java.util.*;

@Service
public class ProductoService {

    private final Map<Long, Producto> productos = new LinkedHashMap<>();
    private Long contadorId = 1L;

    public ProductoService() {
        guardar(new Producto(null, "Laptop", "Laptop 16GB RAM", 1299.99));
        guardar(new Producto(null, "Mouse", "Mouse inalámbrico", 29.99));
        guardar(new Producto(null, "Teclado", "Teclado mecánico", 89.99));
    }

    public List<Producto> obtenerTodos() {
        return new ArrayList<>(productos.values());
    }

    public Optional<Producto> buscarPorId(Long id) {
        return Optional.ofNullable(productos.get(id));
    }

    public Producto guardar(Producto producto) {
        if (producto.getId() == null) {
            producto.setId(contadorId++);
        }
        productos.put(producto.getId(), producto);
        return producto;
    }

    public void eliminar(Long id) {
        productos.remove(id);
    }
}