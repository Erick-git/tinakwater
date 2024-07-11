package com.emartinez.CRUD.controller;

import com.emartinez.CRUD.model.Tinaco;
import com.emartinez.CRUD.service.TinacoService;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TinacoController {

    @Autowired
    private TinacoService tinacoService;

    @PostMapping("/tinaco")
    public Tinaco crearTinaco(@RequestBody Tinaco tinaco) {
        return tinacoService.save(tinaco);
    }

    @GetMapping("/parametros")
    public List<Tinaco> obtenerTodos() {
        return tinacoService.findAll();
    }

    @PutMapping("/{id}")
    public Tinaco actualizarTinaco(@PathVariable Integer id, @RequestBody Tinaco tinacoActualizado) {
        Tinaco tinacoExistente = tinacoService.findById(id);

        if (tinacoExistente != null) {
            tinacoExistente.setVolumen(tinacoActualizado.getVolumen());
            tinacoExistente.setFecha(tinacoActualizado.getFecha());
            tinacoExistente.setFlujo(tinacoActualizado.getFlujo());
            tinacoExistente.setPresion(tinacoActualizado.getPresion());

            return tinacoService.save(tinacoExistente);
        }

        return null;
    }

    @DeleteMapping("/tinaco/{id}")
    public void eliminarTinaco(@PathVariable Integer id){
        tinacoService.delete(id);
    }

}
