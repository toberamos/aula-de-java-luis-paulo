package modulo;

import java.util.Scanner;

public class Multiplos {

public static void main(String[] args) {
		
		double  num1;
		double  num2;
		
		Scanner teclado = new Scanner (System.in); //indica onde ser� a entrada
		System.out.print("Digite um num1: "); //"System.out.print" escreve sem quebra de linha		
		num1= teclado.nextInt(); //nextIn faz a conversao de texto para inteiro (manipula o objeto usando o m�todo)
		System.out.print("Digite um num2: "); //"System.out.print" escreve sem quebra de linha
		num2= teclado.nextInt(); //nextIn faz a conversao de texto para inteiro (manipula o objeto usando o m�todo)
		teclado.close(); //fecha o buffer, o que est� sendo digitado.
		
		if ((num1 % num2 == 0) || (num2 % num1 == 0)) {
		
		System.out.println("S�o Multiplos");
		}
		else
		System.out.println("N�o S�o Multiplos");		
	}		
}





