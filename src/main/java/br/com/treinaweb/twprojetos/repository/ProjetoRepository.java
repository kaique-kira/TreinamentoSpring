package br.com.treinaweb.twprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twprojetos.entity.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

}
