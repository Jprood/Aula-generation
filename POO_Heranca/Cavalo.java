package POO_Heranca;

public class Cavalo extends Animal {
	
    private String correr;
	
	public Cavalo(String nome, String som, int idade, String correr) {
		
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
		
		System.out.println("\nO nome do Cavalo �: "+ getNome()+ "\nO som que ele produz � o: "+ getSom()+ 
				"\nEle tem: "+ getIdade()+ " anos \nE ele est�: "+ correr);
	}

}
