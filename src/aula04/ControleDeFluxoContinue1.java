package aula04;

import java.util.Scanner;

public class ControleDeFluxoContinue1 {
	public static void main(String[] args){
		for (int i = 0; i < 100; i++) {
			if ((i > 50 && i < 60)  || (i > 80 && i < 90)) {
				System.out.println("Não entra: " + i);
				continue;
			}
			System.out.println(i);
		}
	}
}
