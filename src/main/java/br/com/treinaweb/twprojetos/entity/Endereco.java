package br.com.treinaweb.twprojetos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Endereco extends Entidade {

    @Column(nullable = false, length = 2)
    @Enumerated(EnumType.STRING)
    private UF uf;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String numero;

    private String complemento;

    @Override
    public String toString() {
        StringBuilder enderecoCompleto = new StringBuilder();
        enderecoCompleto.append(logradouro).append(", nº ").append(numero)
                .append(", ").append(complemento).append(" - ")
                .append(bairro).append(". ").append(uf.getDescricao())
                .append(" - ").append(cidade).append(". CEP: ").append(cep);

        return enderecoCompleto.toString();
    }
}
