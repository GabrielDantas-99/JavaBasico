import java.util.Locale;
import java.util.Scanner;

public class Repeticao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// === ESTRUTURA DE REPETICAO WHILE ===
		int x = sc.nextInt();
		int soma = 0;
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		System.out.println(soma);
		
		// === ESTRUTURA DE REPETIÇÃO DO WHILE ===
		Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.println("Digite uma temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n'); 
		
		System.out.println("Fim do programa");
		
		// === ESTRUTURA DE REPETIÇÃO FOR ===
		int N = sc.nextInt();
		int SOMA2 = 0;
		for (int i=0; i<N; i++) {
			int y = sc.nextInt();
			SOMA2 += y;
		}
		
		System.out.println(SOMA2);
		
		sc.close();
		
		for (int i=4; i>=0; i--) {
			System.out.println("Valor de i: " + i);
		}

	}

}
