package com.recetasBackend.recetas.service;

import com.recetasBackend.recetas.model.Receta;
import com.recetasBackend.recetas.repository.RecetaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetaService {
    private final RecetaRepository recetaRepository;

    public RecetaService(RecetaRepository recetaRepository) {
        this.recetaRepository = recetaRepository;
    }

    public List<Receta>getAllRecetas(){
        return recetaRepository.findAll();
    }

    public Receta getRecetaById(Long id){
        return recetaRepository.findById(id).orElse(null);
    }

    public Receta createReceta(Receta receta){
        return recetaRepository.save(receta);
    }

    public void deleteReceta(Long id){
        recetaRepository.deleteById(id);
    }


    public Receta editReceta(Long id, Receta receta) {
        return recetaRepository.save(receta);
    }


}
