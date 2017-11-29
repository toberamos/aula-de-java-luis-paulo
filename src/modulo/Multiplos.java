package modulo;

import java.util.Scanner;

public class Multiplos {

public static void main(String[] args) {
		
		double  num1;
		double  num2;
		
		Scanner teclado = new Scanner (System.in); //indica onde será a entrada
		System.out.print("Digite um num1: "); //"System.out.print" escreve sem quebra de linha		
		num1= teclado.nextInt(); //nextIn faz a conversao de texto para inteiro (manipula o objeto usando o método)
		System.out.print("Digite um num2: "); //"System.out.print" escreve sem quebra de linha
		num2= teclado.nextInt(); //nextIn faz a conversao de texto para inteiro (manipula o objeto usando o método)
		teclado.close(); //fecha o buffer, o que está sendo digitado.
		
		if ((num1 % num2 == 0) || (num2 % num1 == 0)) {
		
		System.out.println("São Multiplos");
		}
		else
		System.out.println("Não São Multiplos");		
	}		
}





