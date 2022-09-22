package br.com.treinaweb.twprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twprojetos.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
