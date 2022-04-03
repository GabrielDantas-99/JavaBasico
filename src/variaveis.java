import java.util.Locale;

public class variaveis {

	public static void main(String[] args) {	
		
		// === ESCREVENDO A PRIMEIRA MENSAGEM EM JAVA ===
		System.out.println("Olá Mundo!");
		
		// === CRIANDO UMA VARIAVEL E ESCREVENDO NA TELA ===
		int n = 32;
		System.out.println(n);
		
		// === CRIANDO UMA VARIAVEL DOUBLE E FORMATANDO ===
		double x = 10.35567;
		System.out.printf("%.4f%n", x); // %.2f = Limita as casas decimais; %n = Quebra de linha
		
		// === PADRÃO DE LINGUAGEM US === (Usa o . como separador de decimal)
		Locale.setDefault(Locale.US);
		
		// === CONCATENAÇÃO DE VALORES ===
		System.out.println("Resuldado = " + x + " Metros");
		/*
		> Marcadores de variáveis: 
		- %f = ponto flutuante
		- %d = inteiro
		- %s = texto
		- %n = quebra de linha
		*/
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

	}

}
