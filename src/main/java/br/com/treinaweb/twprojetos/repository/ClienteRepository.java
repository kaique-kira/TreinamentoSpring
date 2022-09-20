package br.com.treinaweb.twprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twprojetos.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}