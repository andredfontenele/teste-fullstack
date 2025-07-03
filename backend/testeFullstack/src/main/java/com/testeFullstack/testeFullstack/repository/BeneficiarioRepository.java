package com.testeFullstack.testeFullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeFullstack.testeFullstack.model.Beneficiario;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {
}