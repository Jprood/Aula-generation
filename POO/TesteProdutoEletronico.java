package POO;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico[] celulares= new ProdutoEletronico[4];
		
		celulares[0] = new ProdutoEletronico("S21", "Branco", 162);
		celulares[1] = new ProdutoEletronico("S21", "Preto", 162);
		celulares[2] = new ProdutoEletronico("S21", "Branco", 256);
		celulares[3] = new ProdutoEletronico("S21", "Preto", 256);
		
		for(ProdutoEletronico roda: celulares) {
			
			roda.imprimirInf();
		}
		
				
	}
}
