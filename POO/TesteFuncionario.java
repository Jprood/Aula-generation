package POO;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario[] funcionarios = new Funcionario[4];
		
		funcionarios[0] = new Funcionario("Arthur", "Programador junior", 3000);
		funcionarios[1] = new Funcionario("Maria", "Programadora senior", 6000);
		funcionarios[2] = new Funcionario("Pedro", "Programador junior", 3200);
		funcionarios[3] = new Funcionario("Thomas", "CEO", 15000);
		
		for(Funcionario roda: funcionarios) {
			
			roda.imprimirInf();
		}

	}

}
