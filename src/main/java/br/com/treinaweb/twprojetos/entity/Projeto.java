package br.com.treinaweb.twprojetos.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Projeto extends Entidade {

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String descricao;

    @Column(name = "data_inicio", nullable = false)
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate dataFim;

    @ManyToOne
    @JoinColumn(name = "cliente_id_fk", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "lider_id_fk", nullable = false)
    private Funcionario lider;

    @Column(nullable = false)
    @NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
    private BigDecimal orcamento;

    @Column(nullable = false)
    @NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
    private BigDecimal gastos;

    @ManyToMany
    @JoinTable(name = "projeto_funcionario", joinColumns = @JoinColumn(name = "projeto_id_fk"), inverseJoinColumns = @JoinColumn(name = "funcionario_id_fk"))
    private List<Funcionario> equipe;

}
