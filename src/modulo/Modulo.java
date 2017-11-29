package modulo;

import java.util.Scanner;

public class Modulo {	

		public static void main(String[] args) {
			
			int num;
			double resul;
			Scanner teclado = new Scanner (System.in); //indica onde será a entrada
			System.out.print("Digite um número: "); //"System.out.print" escreve sem quebra de linha
			num = teclado.nextInt(); //nextIn faz a conversao de texto para inteiro (manipula o objeto usando o método)
			teclado.close(); //fecha o buffer, o que está sendo digitado.
			
			if (num % 2 == 0){
	            resul = num;
				System.out.println("O resultado é: " + resul);
	        }
	       	        
						
		}
}