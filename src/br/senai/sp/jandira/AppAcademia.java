package br.senai.sp.jandira;

import java.time.LocalDate;

import br.senai.sp.jandira.gui.FrameCalculoImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {

	public static void main(String[] args) {
		
//		FrameCalculoImc tela = new FrameCalculoImc();
//		tela.titulo = "Calculadora IMC";
//		tela.altura = 600;
//		tela.largura = 600;
//		tela.criarTela();
		
		FrameCalculoImc tela2 = new FrameCalculoImc();
		tela2.titulo = "Bien venidos";
		tela2.altura = 600;
		tela2.largura = 400;
		tela2.criarTela();
		
		Cliente maria = new Cliente();
		maria.nome = "Maria Antonieta";
		maria.peso = 57;
		maria.altura = 1.67;
		maria.dataNascimento = LocalDate.of(2004, 1, 10);
		
		System.out.println(maria.getImc());
		System.out.println(maria.getIdade());
		System.out.println(maria.getStatusImc());
		
		if (maria.getIdade() >= 21) {
			System.out.printf("%s está autorizado(a), já tem %s de idade!\n\n", maria.nome, maria.getIdade());
		} else {
			System.out.println("Não está autorizado(a) a participar \n\n");
		}
		
		Cliente pedro = new Cliente();
		pedro.nome = "Pedro Alvares Cabral";
		pedro.peso = 78.5;
		pedro.altura = 1.74;
		pedro.dataNascimento = LocalDate.of(1996, 9, 30);
		
		System.out.println(pedro.getImc());
		System.out.println(pedro.getIdade());
		
	}

}
