package com.br.funcionario;

import com.br.funcionario.service.FuncionarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FuncionarioApplication {

	public static void main(String[] args) {

		SpringApplication.run(FuncionarioApplication.class, args);

		FuncionarioService funcionarioService = new FuncionarioService();

		Diretor diretor = new Diretor(5000,"Leo", 49, "M");
		Secretaria secretaria = new Secretaria(1500,"Aline", 25, "F");

		System.out.println(funcionarioService.atualizarSalario(diretor));
		System.out.println(funcionarioService.atualizarSalario(secretaria));
	}

}
