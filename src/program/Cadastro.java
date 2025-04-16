package program;

import java.time.LocalTime;

import models.CaixaBanco;
import models.Cliente;
import models.GerenteBanco;

public class Cadastro {

	public static void main(String[] args) {
		//Instancia do caixa
		CaixaBanco caixa = new CaixaBanco("Carlos", "62131731", 12, 1000, LocalTime.of(18, 30));
		caixa.aumentoSalario(10);
		System.out.println(caixa);		
		System.out.println("\n===========================\n");
		
		//Instancia do gerente
		GerenteBanco gerente = new GerenteBanco("Marcos Silva", "62991234567", 1234, 8500.00, 20.0, "Operacional");
		gerente.aumentoSalario(20);
		System.out.println(gerente);
		
		//Instancia de clientes
		Cliente cliente1 = new Cliente("João Pedro", "62991234567", 28, "123.456.789-00");
		Cliente cliente2 = new Cliente("Maria Oliveira", "62998345678", 34, "987.654.321-11");
		Cliente cliente3 = new Cliente("Carlos Souza", "62999887766", 45, "456.789.123-22");
		
		System.out.println("\n==================================\n");
		
		//Antes de desativar
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(cliente3);
		
		cliente1.desativarCliente();
		
		System.out.println("\n==================================\n");
		//Depois de desativar
		System.out.println(cliente1);
		System.out.println(cliente2);
		System.out.println(cliente3);

		
	}
}
