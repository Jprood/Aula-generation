package POO;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Jo�o Pedro", "um hamb�rguer com batata frita", 1);
		cliente1.imprimirInf();
	
		System.out.println("\n***********Mudan�a no pedido***********");
		cliente1.setPedido(" um hamb�rguer com batata frita e um milkshake ");
	
		Cliente cliente2 = new Cliente("Pietra", "um sorvete de baunilha", 2);
		cliente2.imprimirInf();
	
		Cliente cliente3 = new Cliente("Atlas", "dois Hamb�rgueres", 3);
		cliente3.imprimirInf();
	
	}

}
