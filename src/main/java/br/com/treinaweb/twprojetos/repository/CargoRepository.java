package br.com.treinaweb.twprojetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.twprojetos.entity.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {

}
