package com.br.funcionario.abstracts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public abstract double calcularRemuneracao(double salario);

}
