package POO;

public class Aviao {
	
	/*Crie uma classe avião e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto avião, defina as instancias deste
    objeto e apresente as informações deste objeto no console.*/
	
	private String cor;
	private String modelo;
	private String destino;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private int numerodePassageiros;
	
	public Aviao(String cor, String modelo, String destino, double velocidadeAtual,
			double velocidadeMaxima, int numerodePassageiros) {
		
		this.cor = cor;
		this.modelo = modelo;
		this.destino = destino;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
		this.numerodePassageiros = numerodePassageiros;
		
	}
	public void ImprimirInf() {
		
		System.out.println("\nAvião do modelo: "+ modelo+ " de cor "+ cor+ 
		"\nCom velocidade atual de: "+ velocidadeAtual+ "km/h podendo chegar a: "+ velocidadeMaxima +"km/h"+
		"\nCom "+ numerodePassageiros+ " passageiros indo para: "+ destino);
		
	}
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getNumerodePassageiros() {
		return numerodePassageiros;
	}

	public void setNumerodePassageiros(int numerodePassageiros) {
		this.numerodePassageiros = numerodePassageiros;
	}	

}
