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

import com.testeFullstack.testeFullstack.model.Beneficiario;
import com.testeFullstack.testeFullstack.service.BeneficiarioService;

@RestController
@RequestMapping("/beneficiarios")
public class BeneficiarioController {

    @Autowired
    private BeneficiarioService service;

    @GetMapping
    public List<Beneficiario> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Beneficiario findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Beneficiario save(@RequestBody Beneficiario beneficiario) {
        return service.save(beneficiario);
    }

    @PutMapping("/{id}")
    public Beneficiario update(@PathVariable Long id, @RequestBody Beneficiario beneficiario) {
        beneficiario.setId(id);
        return service.save(beneficiario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
