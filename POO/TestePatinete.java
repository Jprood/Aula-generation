package POO;

public class TestePatinete {
	
	public static void main(String[] args) {
		
		Patinete patinete1 = new Patinete("Vermelho", "Metal", 2, 499);
		patinete1.imprimirInf();
		
		Patinete patinete2 = new Patinete("Azul", "Plastico", 3, 399);
		patinete2.imprimirInf();
		
		Patinete patinete3 = new Patinete("Preto e laranja", "Metal", 2, 550);
		patinete3.imprimirInf();
		
		Patinete patinete4 = new Patinete("Roxo", "Plastico", 2, 270);
		patinete4.imprimirInf();
		
		Patinete patinete5 = new Patinete("Verde", "Metal", 3, 299);
		patinete5.imprimirInf();
		
	}

}
