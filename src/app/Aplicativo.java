package app;

import java.util.Scanner;
import entidade.Telefone;
import entidade.Cliente;

public class Aplicativo {
	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		Telefone t = new Telefone();
		Scanner scan = new Scanner(System.in);
		
				
		System.out.print("Informe o ID: ");
		c.setId(Integer.parseInt(scan.nextLine()));		
		System.out.print("Informe o Nome: ");
		c.setNome(scan.nextLine());		
		System.out.print("Informe o Idade: ");
		c.setIdade(Integer.parseInt(scan.nextLine()));
		
		System.out.print("Informe o ID do telefone: ");
		t.setId(Integer.parseInt(scan.nextLine()));
		System.out.print("Informe o numero do telefone: ");
		t.setNumero(scan.nextLine());
		
		
		scan.close();
		
		System.out.println("O ID ifnormado: " + c.getId());		
		System.out.println("O Nome informado: " +c.getNome());
		System.out.println("A idade informado: "+c.getIdade());
	}
}
