package com.emartinez.CRUD.service;

import com.emartinez.CRUD.model.Tinaco;
import com.emartinez.CRUD.repository.TinacoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TinacoServiceImp implements TinacoService{

    @Autowired
    private TinacoRepo tinacoRepo;

    @Override
    public List<Tinaco> findAll() {
        return (List<Tinaco>) tinacoRepo.findAll();
    }

    @Override
    public Tinaco save(Tinaco tinaco) {
        return tinacoRepo.save(tinaco);
    }

    @Override
    public Tinaco findById(Integer id) {
        return tinacoRepo.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
    tinacoRepo.deleteById(id);
    }
}
