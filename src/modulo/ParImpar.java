package modulo;

import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner teclado = new Scanner (System.in); //indica onde ser� a entrada
		System.out.print("Digite um n�mero: "); //"System.out.print" escreve sem quebra de linha
		num = teclado.nextInt(); //nextIn faz a conversao de texto para inteiro (manipula o objeto usando o m�todo)
		
		teclado.close(); //fecha o buffer, o que est� sendo digitado.
		
		if (num % 2 == 0){
           	System.out.println("Este n�mero � Par. " );
        }
		else       
			System.out.println("Este n�mero � Impar. " );		
	}
}

