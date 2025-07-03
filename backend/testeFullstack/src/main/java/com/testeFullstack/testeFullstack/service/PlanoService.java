package com.testeFullstack.testeFullstack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testeFullstack.testeFullstack.model.Plano;
import com.testeFullstack.testeFullstack.repository.PlanoRepository;

@Service
public class PlanoService {

    @Autowired
    private PlanoRepository repository;

    public List<Plano> findAll() {
        return repository.findAll();
    }

    public Plano findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Plano save(Plano plano) {
        return repository.save(plano);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}