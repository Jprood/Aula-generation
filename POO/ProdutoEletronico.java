package POO;

import java.text.NumberFormat;

public class ProdutoEletronico {
	
	
	/*Crie uma classe produto eletrônico e apresente os atributos e métodos
    referentes esta classe, em seguida crie um objeto produto eletrônico,
    defina as instancias deste objeto e apresente as informações deste objeto no console. */
	
	private String modelo;
	private String cor;
	private double preco;
	private int memoria;
	private int memoriaRAM;
	
	public ProdutoEletronico(String modelo, String cor, int memoria) {
		
		this.modelo = modelo;
		this.cor = cor;
		this.memoria = memoria ;
		
	}
	int celularRAM() {
		
		if(this.getMemoria() == 162) {
			
			this.setMemoriaRAM(6);
		}
		if(this.getMemoria() == 256) {
			
			this.setMemoriaRAM(8);
		}return memoriaRAM;
	}
	
	double celularPreco() {
		
		if(this.getMemoria() == 162) {
			
			this.setPreco(4500);
		}
		if(this.getMemoria() == 256) {
			
			this.setPreco(5000);
		}return preco;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}
	

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public float getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public float getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}
	
	public String FormatarMoeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(this.celularPreco());
		return formatoMoeda;
	}
	public void imprimirInf() {
		
		System.out.println("\nModelo do celular: "+ modelo+ "\nCor: "+ cor+ "\nMemoria de: "+ memoria+ "GB "
				+ "\nMemoria Ram de: "+ this.celularRAM()+ "GB \nPreço: "+ this.FormatarMoeda());
	}
	
	
}

