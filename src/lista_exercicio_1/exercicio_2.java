package lista_exercicio_1;

public class exercicio_2 {

	public static void main(String[] args) {
		// Nome: Mateus Gon�alves de Souza | RA: 119122458
		// Nome: Vin�cius Gon�alves de Souza | RA: 119122170

		int cont = 0;
		int[] vetorNum = { 1,2,3, 4, 5, 6, 7, 8, 9, 11, 10 };
		for (int a = 0; a < vetorNum.length; a++) {
			for (int i = 1; i <= vetorNum[a]; i++) {
				if (vetorNum[a] % i == 0) {
					cont++;
				}

			}
			if (cont == 2) {
				System.out.println("O n�mero: " + vetorNum[a] + " � primo" + " e sua prosi��o no array �: " + a);
			}
			cont = 0;
		}
	}

}
