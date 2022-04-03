
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// === ESCREVENDO A PRIMEIRA MENSAGEM EM JAVA ===
		System.out.println("Olá Mundo!");
		
		// === CRIANDO UMA VARIAVEL E ESCREVENDO NA TELA ===
		int n = 32;
		System.out.println(n);
		
		// === CRIANDO UMA VARIAVEL DOUBLE E FORMATANDO ===
		double x = 10.35567;
		System.out.printf("%.4f%n", x); //%.2f = Limita as casas decimais; %n = Quebra de linha
		
		// === PADRÃO DE LINGUAGEM US === (Usa o . como separador de decimal)
		Locale.setDefault(Locale.US);
		
		// === CONCATENAÇÃO DE VALORES ===
		System.out.println("Resuldado = " + x + " Metros");
		
		// Marcadores de variáveis: 
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		
		String nome = "Gabriel";
		int idade = 23;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		// === CALCULO DE UM TRAPEZIO ===
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (B + b) / 2 * h;
		System.out.println(area);
		
		// === CASTING DE VARIAVEIS ===
		int a, c;
		double resultado;
		a = 5;
		c = 2;
		resultado = (double) a / c;
		System.out.println(resultado);
		
		// === ENTRADA DE DADOS ===
		Scanner sc = new Scanner(System.in); // Inicia a variavel scanner(leitor)
		String w; // Declara o tipo de variável
		w = sc.next(); // Ler texto
		// sc.nextInt(): Ler inteiros
		// w = sc.nextDouble();  Ler Doubles(Prestar atencao ao locale)
		// sc.next().charAt(0): Ler o 1º caracter
		System.out.println("Voce digitou: " + w);
		
		// === ENTRADA DOUBLE COM VIRGULA ===
		Scanner sc = new Scanner(System.in);
		double w;
		w = sc.nextDouble();
		System.out.println("Voce digitou " + w); // println : retorna com .
		System.out.printf("Voce digitou: %.2f", w); // printf : retorna com ,
		
		// === ENTRADA DOUBLE COM PONTO ===
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();
		System.out.println("Voce digitou: " + x);
		System.out.printf("Voce digitou %.4f", x);
		
		// === LER VÁRIOS DADOS NA MESMA LINHA ===
		Scanner sc = new Scanner(System.in);
		// Declarando e lendo variaveis
		String x; x = sc.next();
		int y; y = sc.nextInt();
		double z; z = sc.nextDouble();
		// Imprimindo variáveis
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		// === LENDO VALORES EM LINHAS DIFERENTES ===
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		s1 = sc.nextLine(); // nextLine(): Ler ate a proxima linha
		s2 = sc.nextLine();
		s3 = sc.nextLine(); // next(): Ler apenas uma palavra
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// === LENDO VALORES COM LINHA PENDENTE ===
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		// Ao usar um comando diferente de nextLine e clicar enter
		x = sc.nextInt(); // A proxima variável irá consumir esse espaço vazio
		sc.nextLine(); // A solução é usar o nextLine vazio para consumi-lo
		s1 = sc.nextLine(); 
		s2 = sc.nextLine();
		s3 = sc.nextLine(); 
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);		
		
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
		double x1, x2, a, b, c;
		a = 10.0;
		b = 20.1;
		c = 5.1;
		double delta = (b * b) - (4 * a * c) ;
		System.out.println(delta);
		System.out.println(Math.sqrt(delta));
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		System.out.printf("x1 = %.2f%n",  x1);
		System.out.printf("x2 = %.2f",  x2);
		
		// === ESTRUTURAS CONDICINAIS ===
		System.out.println("Quantas horas?");
		int hora = sc.nextInt();
		if (hora < 12 ) {
			System.out.println("Bom dia!");
			
		} else if (hora < 18) {
			System.out.println("Boa tarde");
			
		} else {
			System.out.println("Boa noite");
			
		}
		
		// === ESTRUTURA SWITCH CASE ===
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "Domingo"; break;
		case 2:
			dia = "Segunda"; break;
		case 3:
			dia = "Terca"; break;
		case 4:
			dia = "Quarta"; break;
		case 5:
			dia = "Quinta"; break;
		case 6:
			dia = "Sexta"; break;
		case 7:
			dia = "Sabado"; break;
		default:
			dia = "Valor invalido"; break;
		}
		System.out.println("Dia da semana: " + dia);
		
		// === EXPRESSOES TERNARIAS ===
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
		
		// === COMO DEBUGAR === 
		// Seleciona uma linha para ser testada/iniciada
		// Run -> Toggle Breakpoint (ctrol + shift + b)
		// Botao direito na classe -> Debug as -> Java Aplication
		// Aceitar para mudar para layout de debug
		// f6: executar proxima linha
		// Canto superior direito: Pespectiva Java
		// ctrl + f2: cancelar debug
		
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
		Scanner sc = new Scanner(System.in);
		
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
		int soma = 0;
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		for (int i=0; i<5; i--) {
			System.out.println("Valor de i: " + i);
		}
			
		// === OPERADORES BITWISE === 
		// & : Operação "E" bit a bit
		// | : Operação "OU" bit a bit
		// ^ : Operação "OU-exclusivo bit a bit (Não da True quando ambas sao TRUE
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		// === FUNCOES PARA STRING ===
		// Formatar para minusculo/ maiusculo: toLowerCase(), toUpperCase()
		// Remover espacos: trim();
		// Substituir: Replace(char, char) ou Replace(string, string)
		// Buscar: indexOf, lastIndexOf
		// str.split(""): separar de acordo com o separador
		// substring(index) : Cria uma nova string a partir do index fornecido
		
		String original = " abcde FGHIJ ABC DEFG  ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(3);
		String s05 = original.substring(3, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int k = original.lastIndexOf("bc");		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(3): -" + s04 + "-");
		System.out.println("substring(3, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("indexOf('bc'): -" + i + "-");
		System.out.println("lastIndexOf('bc'): -" + k + "-");
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		
		// === FUNÇOES ===
		
		
	}

}

