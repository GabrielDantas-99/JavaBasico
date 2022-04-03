
public class FuncMat {

	public static void main(String[] args) {
		// === FUNÇÕES MATEMÁTICAS EM JAVA ===
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a, b, c;
		// Raiz quadrada
		a = Math.sqrt(x);
		System.out.printf("Raiz quadrada de %.4f = %.4f%n", x , a);
		// Potencia
		b = Math.pow(y, 2.0);
		System.out.printf("%.2f ao quadrado = %.2f%n", y, b);
		// Valor absoluto
		c = Math.abs(z);
		System.out.printf("O absoluto de %.2f é %.2f", z, c);
		
		// Baskhara
		double x1, x2, A, B, C;
		A = 10.0;
		B = 20.1;
		C = 5.1;
		double delta = (B * B) - (4 * A * C) ;
		System.out.println(delta);
		System.out.println(Math.sqrt(delta));
		x1 = (-B + Math.sqrt(delta)) / (2.0 * A);
		x2 = (-B - Math.sqrt(delta)) / (2.0 * A);
		System.out.printf("x1 = %.2f%n",  x1);
		System.out.printf("x2 = %.2f",  x2);

	}

}
