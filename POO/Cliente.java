package POO;

public class Cliente {
	
	/*Crie uma classe cliente e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto cliente, defina as instancias deste
    objeto e apresente as informações deste objeto no console.*/
	
	private String nomeCliente;
	private String pedido;
	private int numerodoPedido;
	
	public Cliente(String nomeCliente, String pedido, int numerodoPedido) {
		
			this.nomeCliente = nomeCliente;
			this.pedido = pedido;
			this.numerodoPedido = numerodoPedido;
		
			}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public int getNumerodoPedido() {
		return numerodoPedido;
	}

	public void setNumerodoPedido(int numerodoPedido) {
		this.numerodoPedido = numerodoPedido;
	}
	public void imprimirInf() {
		
		System.out.println("\nCliente: "+ nomeCliente+ "\nNúmero do pedido: "+ numerodoPedido+ "\nPedido: "+ pedido);
	}
	
	}
