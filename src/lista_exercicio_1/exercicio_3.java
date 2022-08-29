package lista_exercicio_1;

import java.util.*;

public class exercicio_3 {

	public static void main(String[] args) {
		// Nome: Mateus Gonçalves de Souza | RA: 119122458
		// Nome: Vinícius Gonçalves de Souza | RA: 119122170
		
		Scanner ler = new Scanner(System.in);
		String carros;
		int conb;
		int idx_menor_comb;
		
	    ArrayList<String> cars = new ArrayList<String>(); 
	    for(int i = 0 ; i <= 4 ; i++) {
			System.out.printf("Informe um modelo de carro: ");
			carros = ler.next();
			cars.add(carros);
	    }
	    
	    ArrayList<Integer > conbustivel = new ArrayList<Integer >(); 
	    for(int i = 0 ; i <= 4 ; i++) {
			System.out.printf("Informe um consumo: ");
			conb = ler.nextInt();
			conbustivel.add(conb);
	    }
	    
        idx_menor_comb = conbustivel.indexOf(Collections.min(conbustivel));
        System.out.println("O Carro que faz o menor consumo é : " + cars.get(idx_menor_comb));
        
        for(int d:conbustivel) {
        	System.out.println("O consumo dos carros por 1000Km é : " + 1000/d );
        }
	}

}