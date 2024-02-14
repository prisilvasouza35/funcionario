package com.br.funcionario.service;

import com.br.funcionario.Funcionario;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    public double atualizarSalario( Funcionario cargo){
        return cargo.calcularRemuneracao(cargo.getSalario());
    }
}
