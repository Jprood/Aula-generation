package POO;

import java.text.NumberFormat;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private double salario;
	
	public Funcionario(String nome, String cargo, double salario) {
		
		this.setNome(nome);
		this.setCargo(cargo);
		this.setSalario(salario);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String FormatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatomoeda = nf.format(salario);
		return formatomoeda;
	}
	public void imprimirInf() {
		
		System.out.println("\n"+ nome+ " funcionario(a) com o cargo de "+ cargo+ " recebe "+ this.FormatarMoeda());
	}
	

}
