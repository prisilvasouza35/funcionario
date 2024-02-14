package com.br.funcionario;

import com.br.funcionario.abstracts.Pessoa;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(double salario, String nome, int idade, String sexo) {
        this.salario = salario;
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    public double calcularRemuneracao(double salario){
       return salario;
   }

}
