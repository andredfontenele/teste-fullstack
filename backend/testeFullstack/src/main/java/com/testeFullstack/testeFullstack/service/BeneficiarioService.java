package com.testeFullstack.testeFullstack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testeFullstack.testeFullstack.model.Beneficiario;
import com.testeFullstack.testeFullstack.repository.BeneficiarioRepository;

@Service
public class BeneficiarioService {

    @Autowired
    private BeneficiarioRepository repository;

    public List<Beneficiario> findAll() {
        return repository.findAll();
    }

    public Beneficiario findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Beneficiario save(Beneficiario beneficiario) {
        return repository.save(beneficiario);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
