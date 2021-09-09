package POO_Heranca;

public class Cachorro extends Animal {
	
	private String correr;
	
	public Cachorro(String nome, String som, int idade, String correr) {
		
		super(nome, som, idade);
		this.correr = correr;
		
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	public void imprimirInf() {
		
		System.out.println("\nO nome do Cachorro é: "+ getNome()+ "\nO som que ele produz é o: "+ getSom()+ 
				"\nEle tem: "+ getIdade()+ " anos \nE ele está: "+ correr);
	}

}
