package POO_Heranca;

public class Preguica extends Animal {
	
	private String subirArvore;
	
	public Preguica(String nome, String som, int idade, String subirArvore) {
		
		super(nome, som, idade);
		this.subirArvore = subirArvore;
		
	}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	public void imprimirInf() {
		
		System.out.println("\nO nome da Pregui�a �: "+ getNome()+ "\nO som que ela produz � o: "+ getSom()+ 
		"\nEla tem: "+ getIdade()+ " anos \nE ela est�: "+ subirArvore);
	}

}
