package com.br.funcionario;

public class Secretaria extends Funcionario{
    public Secretaria(double salario, String nome, int idade, String sexo) {
        super(salario, nome, idade, sexo);
    }

    @Override
    public double calcularRemuneracao(double salario) {
        salario = salario * 1.5;
        return salario;
    }
}
