package lista_exercicio_1;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nome: Mateus Gon�alves de Souza | RA: 119122458
		// Nome: Vin�cius Gon�alves de Souza | RA: 119122170


		Scanner ler = new Scanner(System.in);
		int[] num = {2, 3, 4,5,6};
		boolean [] alteracao = {false,false,false,false,false };
		char res;
		
		for (int e = 0; e < 2; e++) {
			for (int i = 0; i < num.length; i++) {
				System.out.printf("Deseja alterar o valor do array ? : ");
				res = ler.next().charAt(0);
				
				if (res == 's') {
					if (alteracao[i] == false) {
						System.out.printf("Novo numero do array da posição "+(i+1)+" : ");
						num[i] = ler.nextInt();
						alteracao[i] = true;
					}
				}
			}
		}
		
		for (int n = 0; n < num.length; n++) {
			System.out.println(num[n]);
			
		}
	}

}
