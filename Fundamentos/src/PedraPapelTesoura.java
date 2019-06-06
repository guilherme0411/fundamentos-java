import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
	//l�gica do jogador
		int jogador;
		Scanner mao = new Scanner(System.in);
		System.out.println("______________________");
		System.out.println("________JoKenPo_______");
		System.out.println("______________________");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("Digite a op��o desejada:");
		jogador = mao.nextInt();
		//estrutura switch case admite apenas tipo int e char
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}
		//l�gica do computador
		//a linha abaixo gera n�meros aleatorios entre 0 e 2
		//(int) converte para tipo inteiro (casting)
		//+1 soma 1 ao resultado (1 ou 2 ou 3)
		int computador = (int)(Math.random() * 3 + 1);
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		}
		//l�gica para determinar o vencedor ou empate
		if (jogador == computador) {
			System.out.println("EMPATE");
		} else {
			if((jogador == 1 && computador == 3) || (jogador == 2 && computador == 2) || (jogador == 3 && computador == 2)) {
				System.out.println("JOGADOR VENCEU");
			}else {
				System.out.println("COMPUTADOR VENDEU");
			}
		}
		mao.close();
	}

}
