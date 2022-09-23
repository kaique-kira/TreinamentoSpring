package br.com.treinaweb.twprojetos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cargo extends Entidade {

    @Column(nullable = false, length = 40, unique = true)
    private String nome;
}
