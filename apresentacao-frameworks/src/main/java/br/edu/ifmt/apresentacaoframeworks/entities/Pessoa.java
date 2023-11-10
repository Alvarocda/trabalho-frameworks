package br.edu.ifmt.apresentacaoframeworks.entities;

import br.edu.ifmt.apresentacaoframeworks.enums.ESexo;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "pessoas")
public class Pessoa {
    @Id
    private Long id;
    private String nome;
    private Long cpf;
    private String rg;
    private String sobrenome;
    private LocalDate nascimento;
    private ESexo sexo;

    @Enumerated(EnumType.STRING)
    @Column(name = "enum_sexo", nullable = false)
    private ESexo enumSexo;

    public ESexo getEnumSexo() {
        return enumSexo;
    }

    public void setEnumSexo(ESexo enumSexo) {
        this.enumSexo = enumSexo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public ESexo getSexo() {
        return sexo;
    }

    public void setSexo(ESexo sexo) {
        this.sexo = sexo;
    }
}
