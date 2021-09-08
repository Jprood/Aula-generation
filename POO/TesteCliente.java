package POO;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("João Pedro", "um hambúrguer com batata frita", 1);
		cliente1.imprimirInf();
	
		System.out.println("\n***********Mudança no pedido***********");
		cliente1.setPedido(" um hambúrguer com batata frita e um milkshake ");
	
		Cliente cliente2 = new Cliente("Pietra", "um sorvete de baunilha", 2);
		cliente2.imprimirInf();
	
		Cliente cliente3 = new Cliente("Atlas", "dois Hambúrgueres", 3);
		cliente3.imprimirInf();
	
	}

}
