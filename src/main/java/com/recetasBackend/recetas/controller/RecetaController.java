package com.recetasBackend.recetas.controller;

import com.recetasBackend.recetas.RecetasApplication;
import com.recetasBackend.recetas.model.Receta;
import com.recetasBackend.recetas.service.RecetaService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/{id}")
    public Receta getRecetaById(@PathVariable Long id){
        return recetaService.getRecetaById(id);
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




}
