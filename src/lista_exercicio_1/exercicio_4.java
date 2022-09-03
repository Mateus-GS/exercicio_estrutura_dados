package lista_exercicio_1;

import java.util.*;

public class exercicio_4 {

	public static void main(String[] args) {
		// Nome: Mateus Gonçalves de Souza | RA: 119122458
		// Nome: Vinícius Gonçalves de Souza | RA: 119122170

		Scanner ler = new Scanner(System.in);
		int valor;
		int total_descoberto = 0;
		int total_roubado;
		int cont = 0;

		// Valor de cada suspeito
		int[] valor_investigado = new int[10];
		for (int i = 0; i < valor_investigado.length; i++) {
			System.out.printf("Valor R$ °" + (i + 1) + " suspeito: ");
			valor_investigado[i] = ler.nextInt();
		}

		System.out.print("Valor roubado pelo ladrão que menos roubou: ");
		int valor_confessado = ler.nextInt();

		for (int i = 0; i < valor_investigado.length; i++) {
			if (valor_confessado == valor_investigado[i]) {
				cont++;
			}
		}

		for (int i = 0; i < valor_investigado.length; i++) {
			if ((valor_investigado[i] % 10 == 0) && (valor_investigado[i] > valor_confessado)) {
				total_descoberto = total_descoberto + valor_investigado[i];
			}
		}

		if (cont > 1) {
			total_roubado = (total_descoberto + (valor_confessado * cont));
			System.out.println("Total roubado : " + total_roubado);
		} else {
			total_roubado = total_descoberto + valor_confessado;
			System.out.println("Total roubado : " + total_roubado);
		}

	}

}
