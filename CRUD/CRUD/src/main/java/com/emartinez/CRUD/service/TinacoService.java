package com.emartinez.CRUD.service;

import com.emartinez.CRUD.model.Tinaco;

import java.util.List;

public interface TinacoService {
    List<Tinaco> findAll();
    Tinaco save(Tinaco tinaco);
    Tinaco findById(Integer id);
    void delete(Integer id);


}
