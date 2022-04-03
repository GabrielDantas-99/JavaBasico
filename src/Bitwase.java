import java.util.Scanner;

public class Bitwase {

	public static void main(String[] args) {
		// === OPERADORES BITWISE === 
		// & : Operação "E" bit a bit
		// | : Operação "OU" bit a bit
		// ^ : Operação "OU-exclusivo bit a bit (Não da True quando ambas sao TRUE
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true");
		} else {
			System.out.println("6th bit is false");
		}
		
		sc.close();

	}

}
