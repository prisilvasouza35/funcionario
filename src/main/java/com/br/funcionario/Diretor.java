package com.br.funcionario;

public class Diretor extends Funcionario {
    public Diretor(double salario, String nome, int idade, String sexo) {
        super(salario, nome, idade, sexo);
    }

    @Override
    public double calcularRemuneracao(double salario) {
        salario = salario * 2;
        return salario;
    }
}
