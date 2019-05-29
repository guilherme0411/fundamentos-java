import java.util.Scanner;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Cálculo da Média
 * @author guilherme.oliveira17
 */

		public class CalculoIMC {
		public static void main(String[] args) {
		double altura, peso, resultado;
		System.out.println("Cálculo do IMC");
		//Criando um objeto para entrada de dados
		Scanner leia = new Scanner(System.in);
		// a linha abaixo configura o separador para ponto
		//criando um objeto para formatar o resultado
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("Digite sua altura: ");
		altura = leia.nextDouble();
		System.out.println("Digite seu peso: ");
		peso = leia.nextDouble();
		resultado = peso / (altura * altura); {
		System.out.println("Seu IMC é: " + formatador.format(resultado));
		if (resultado < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (resultado >= 18.5 && resultado < 25) {
			System.out.println("Peso normal");
		}else if (resultado >= 25 && resultado < 30) {
			System.out.println("Acima do peso");
		}else {
			System.out.println("Obeso");
		}
		leia.close();
	}
}
}
