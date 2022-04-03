import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		// === ENTRADA DE DADOS ===
		Scanner sc = new Scanner(System.in); // Inicia a variavel scanner(leitor)
		
		String w; // Declara o tipo de variável
		w = sc.next(); // Ler texto
		// sc.nextInt(): Ler inteiros
		// w = sc.nextDouble();  Ler Doubles(Prestar atencao ao locale)
		// sc.next().charAt(0): Ler o 1º caracter
		System.out.println("Voce digitou: " + w);
		
		// === ENTRADA DOUBLE COM VIRGULA ===
		double a;
		a = sc.nextDouble();
		System.out.println("Voce digitou " + a); // println : retorna com .
		System.out.printf("Voce digitou: %.2f", a); // printf : retorna com ,
		
		// === ENTRADA DOUBLE COM PONTO ===
		Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		double d;
		d = sc.nextDouble();
		System.out.println("Voce digitou: " + d);
		System.out.printf("Voce digitou %.4f", d);
		
		// === LER VÁRIOS DADOS NA MESMA LINHA ===
		//Scanner sc = new Scanner(System.in);
		// Declarando e lendo variaveis
		String x; x = sc.next();
		int y; y = sc.nextInt();
		double z; z = sc.nextDouble();
		// Imprimindo variáveis
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		// === LENDO VALORES EM LINHAS DIFERENTES ===
		//Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		s1 = sc.nextLine(); // nextLine(): Ler ate a proxima linha
		s2 = sc.nextLine();
		s3 = sc.nextLine(); // next(): Ler apenas uma palavra
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// === LENDO VALORES COM LINHA PENDENTE ===
		//Scanner sc = new Scanner(System.in);
		int p;
		String x1, x2, x3;
		// Ao usar um comando diferente de nextLine e clicar enter
		p = sc.nextInt(); // A proxima variável irá consumir esse espaço vazio
		sc.nextLine(); // A solução é usar o nextLine vazio para consumi-lo
		x1 = sc.nextLine(); 
		x2 = sc.nextLine();
		x3 = sc.nextLine(); 
		System.out.println(p);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);

	}

}
