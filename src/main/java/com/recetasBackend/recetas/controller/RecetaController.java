package com.recetasBackend.recetas.controller;

import com.recetasBackend.recetas.model.Receta;
import com.recetasBackend.recetas.service.RecetaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/recetas")
public class RecetaController {

    private final RecetaService recetaService;

    public RecetaController(RecetaService recetaService) {
        this.recetaService = recetaService;
    }

    @GetMapping
    public List<Receta> getAllrecetas(){
        return recetaService.getAllRecetas();
    }

    @PostMapping
    public Receta createReceta(@RequestBody Receta receta){
        return recetaService.createReceta(receta);
    }

    @DeleteMapping("/{id}")
    public String deleteReceta(@PathVariable Long id){
        recetaService.deleteReceta(id);
        return "Receta eliminada con éxito";
    }

    @PutMapping("/{id}")
    public String updateReceta(@PathVariable Long id, @RequestBody Receta receta) {
        recetaService.updateReceta(id, receta);
        return "Receta actualizada con éxito";
    }

}
