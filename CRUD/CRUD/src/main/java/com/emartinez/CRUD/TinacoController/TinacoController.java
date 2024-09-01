package com.emartinez.CRUD.TinacoController;

import com.emartinez.CRUD.model.Tinaco;

import com.emartinez.CRUD.service.TinacoIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/measure-water-level")
public class TinacoController {

    @Autowired
    private TinacoIService Service;

    @PostMapping("/tinaco")
    public Tinaco crearTinaco(@RequestBody Tinaco tinaco) {
        TinacoIService tinacoService;
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
