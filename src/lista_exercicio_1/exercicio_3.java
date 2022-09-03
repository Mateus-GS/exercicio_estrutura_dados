package lista_exercicio_1;

import java.util.*;

public class exercicio_3 {

	public static void main(String[] args) {
		// Nome: Mateus Gonçalves de Souza | RA: 119122458
		// Nome: Vinícius Gonçalves de Souza | RA: 119122170
		
		Scanner ler = new Scanner(System.in);
		String[] cars = new String[4];
		int[] consumo = new int[4];
		
		// Lendo nome dos carros e consumos
		System.out.println("===== Modelo e consumo dos carros ====== ");
	    for(int i = 0 ; i < 4 ; i++) {
			System.out.printf("Modelo de carro: ");
			cars[i] = ler.next();
			System.out.printf("Consulmo do " + cars[i] + ": ");
			consumo[i] = ler.nextInt();
	    }
	    
	    // Modelo de carro mais econômico
	    System.out.println("===== Carro mais econômico ====== ");
	    int [] consumoColne = consumo.clone();
	    Arrays.sort(consumoColne);
	    for (int i = 0 ; i < consumo.length ; i++) {
	    	if (consumoColne[0] == consumo[i]) {
				System.out.println("O carro com o menor consumo é o " + cars[i]);
			}
		}

	    // Mostrando consumo do carro por KM
	    System.out.println("===== Consumo por KM dos carros ====== ");
	    for (int i = 0 ; i < cars.length ; i++) {
	    	System.out.println("O consumo do "+ cars[i] +" por 1000Km é : " + 1000/consumo[i] );
		}
	}

}