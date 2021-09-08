package POO;

public class TesteAviao {

	public static void main(String[] args) {
		
		Aviao[] avioesnoAr = new Aviao[3];
		
		avioesnoAr[0] = new Aviao("Branco", "Boeing 747", "Budapeste", 514, 988, 378);
		avioesnoAr[1] = new Aviao("Branco", "Airbus A380", "Paris", 600, 1.185, 600);
		avioesnoAr[2] = new Aviao("Preto", "Boeing 747", "São Paulo", 850, 988, 400);
		
		for(Aviao roda: avioesnoAr) {
			
			roda.ImprimirInf();
		}

	}

}
