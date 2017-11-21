package exemplos;

public class Atribuicao {
	public static void main(String[] args) {
		
		int x = 5;
		int y;
		
		y = x++;
		y = ++x;
		System.out.println("Saidas: \nx: " + x +  "\ny: " + y);
	}
}
