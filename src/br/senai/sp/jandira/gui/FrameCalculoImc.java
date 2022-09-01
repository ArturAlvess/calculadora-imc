package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

public class FrameCalculoImc {

	public String titulo;
	public int altura;
	public int largura;
	
	public void criarTela( ) {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		tela.getContentPane().setBackground(new Color(51, 49, 49));
		
		// Pegar o container para colocar componentes detro dele
		Container painel = tela.getContentPane();
		
		// Criar componentes que serão colocados no container (painel)
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBackground(new Color(252, 179, 8));
		buttonCalcular.setBounds(260, 430, 100, 30);
		
		
		JTextField textFieldNome = new JTextField();
		textFieldNome.setBounds(30, 110, 200, 30);
		
		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(30, 170, 200, 30);
		
		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setBounds(30, 230, 200, 30);
		
		JTextField textFieldNascimento = new JTextField();
		textFieldNascimento.setBounds(30, 300, 200, 30);
 		
		// Criar componentes label
		
		JLabel imc = new JLabel();
		imc.setFont(new Font("Monospaced", Font.BOLD, 26));
		imc.setForeground(new Color(252, 179, 8));
		imc.setBackground(Color.white);
		imc.setText("IMC");
		imc.setBounds(30, 30, 100, 40);
		
		JLabel nome = new JLabel();
		nome.setText("Nome:");
		nome.setForeground(Color.white);
		nome.setBounds(30, 60, 180, 70);
		
		JLabel peso = new JLabel();
		peso.setText("Peso:");
		peso.setForeground(Color.white);
		peso.setBounds(30, 60, 180, 200);
		
		JLabel altura = new JLabel();
		altura.setText("Altura:");
		altura.setForeground(Color.white);
		altura.setBounds(30, 60, 180, 320);
		
		JLabel dataNascimento = new JLabel();
		dataNascimento.setText("Data Nasc.:");
		dataNascimento.setForeground(Color.white);
		dataNascimento.setBounds(30, 60, 180, 450);
		
		JLabel imcResultado = new JLabel();
		imcResultado.setText("Seu IMC...");
		imcResultado.setForeground(Color.white);
		imcResultado.setBounds(30, 60, 180, 590);
		
		JLabel imcStatus = new JLabel();
		imcStatus.setText("Seu Status IMC...");
		imcStatus.setForeground(Color.white);
		imcStatus.setBounds(30, 60, 180, 660);
		
		JLabel idade = new JLabel();
		idade.setText("Sua idade é...");
		idade.setForeground(Color.white);
		idade.setBounds(30, 60, 180, 740);
		
		//
		
		// Colocar os componentes no container
		painel.add(buttonCalcular);
		painel.add(textFieldNome);
		painel.add(nome);
		painel.add(imc);
		painel.add(peso);
		painel.add(textFieldPeso);
		painel.add(altura);
		painel.add(textFieldAltura);
		painel.add(dataNascimento);
		painel.add(textFieldNascimento);
		painel.add(imcResultado);
		painel.add(imcStatus);
		painel.add(idade);
		
		
		tela.setVisible(true);
		
		// Definir um listener para o botão
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Cliente cliente = new Cliente();
				cliente.nome = textFieldNome.getText();
				cliente.peso = Integer.parseInt(textFieldPeso.getText());
				cliente.altura = Double.parseDouble(textFieldAltura.getText());
				
				imcResultado.setText(String.format("%.2f", cliente.getImc()));
				imcStatus.setText(cliente.getStatusImc());
				
				
				// Determinar a idade do cliente
				String[] data = textFieldNascimento.getText().split("/");
				int dia = Integer.parseInt(data[0]);
				int mes = Integer.parseInt(data[1]);
				int ano = Integer.parseInt(data[2]);
				
				cliente.dataNascimento = LocalDate.of(ano, mes, dia);
				
				idade.setText("Sua idade é: " + cliente.getIdade());
				
				
			}
		});
		
		
		
	}
	
	
	
}
