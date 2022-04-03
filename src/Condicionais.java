import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		// === ESTRUTURAS CONDICINAIS ===
		Scanner sc = new Scanner(System.in);
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

	}

}
