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
		
	    ArrayList<Integer > valor_investigado = new ArrayList<Integer >(); 
	    for(int i = 1 ; i <= 10 ; i++) {
	    	System.out.printf("Valor R$ °"+i+" suspeito: ");
			valor = ler.nextInt();
			valor_investigado.add(valor);
	    }
	    
		System.out.print("Valor roubado pelo ladrão que menos roubou: ");
		int valor_confessado = ler.nextInt();
	      
	     for(int e:valor_investigado) {
	    	  if (valor_confessado == e) 
	    		cont++;
	        
	       } 

	     for(int d:valor_investigado) {
	    	  if ((d % 10 == 0) && (d > valor_confessado)  )
	    		total_descoberto = total_descoberto + d;
	        
	       } 
	     
	     if (cont > 1) {
	    	 
	    	 total_roubado = (total_descoberto + (valor_confessado * cont));
	    	 System.out.println("Total roubado : " + total_roubado);
	     }else {
	    	 total_roubado = total_descoberto + valor_confessado;
	    	 System.out.println("Total roubado : " + total_roubado);
	     }

	}

}
