package POO;

import java.text.NumberFormat;

public class Patinete {
	
	/*Crie uma classe patinete e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto patinete, defina as instancias deste
    objeto e apresente as informações deste objeto no console.*/
	
	private String cor;
	private String material;
	private int numerodeRodas;
	private double preco;
	
	public Patinete(String cor, String material, int numerodeRodas, double preco) {
		
		this.cor = cor;
		this.material = material;
		this.numerodeRodas = numerodeRodas;
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getNumerodeRodas() {
		return numerodeRodas;
	}

	public void setNumerodeRodas(int numerodeRodas) {
		this.numerodeRodas = numerodeRodas;
	}
	
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String FormatarMoeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatomoeda = nf.format(preco);
		return formatomoeda;
	}
				
		public void imprimirInf() {
		
		System.out.println("\nPatinete "+ cor+ " feito de "+ material+ " com "+ numerodeRodas+ " rodas por apenas "+ this.FormatarMoeda());
	}

}
