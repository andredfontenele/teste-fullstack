package com.testeFullstack.testeFullstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testeFullstack.testeFullstack.model.Plano;
import com.testeFullstack.testeFullstack.service.PlanoService;

@RestController
@RequestMapping("/planos")
public class PlanoController {

    @Autowired
    private PlanoService service;

    @GetMapping
    public List<Plano> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Plano findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Plano save(@RequestBody Plano plano) {
        return service.save(plano);
    }

    @PutMapping("/{id}")
    public Plano update(@PathVariable Long id, @RequestBody Plano plano) {
        plano.setId(id);
        return service.save(plano);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
