package com.testeFullstack.testeFullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeFullstack.testeFullstack.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByLogin(String login);
}
