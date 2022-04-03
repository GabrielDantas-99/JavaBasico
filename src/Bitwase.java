import java.util.Scanner;

public class Bitwase {

	public static void main(String[] args) {
		// === OPERADORES BITWISE === 
		// & : Opera��o "E" bit a bit
		// | : Opera��o "OU" bit a bit
		// ^ : Opera��o "OU-exclusivo bit a bit (N�o da True quando ambas sao TRUE
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
