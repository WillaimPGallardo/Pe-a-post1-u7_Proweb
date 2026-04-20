package com.universidad.productosweb.controller;

import com.universidad.productosweb.model.Producto;
import com.universidad.productosweb.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService servicio;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("productos", servicio.obtenerTodos());
        return "productos/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("producto", new Producto());
        model.addAttribute("accion", "Crear");
        return "productos/formulario";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Producto producto = servicio.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        model.addAttribute("producto", producto);
        model.addAttribute("accion", "Editar");
        return "productos/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Producto producto) {
        servicio.guardar(producto);
        return "redirect:/productos";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        servicio.eliminar(id);
        return "redirect:/productos";
    }
}