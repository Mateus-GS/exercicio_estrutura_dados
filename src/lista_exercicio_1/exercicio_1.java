package lista_exercicio_1;
import java.util.Scanner;
public class exercicio_1 {

	public static void main(String[] args) {
		// Nome: Mateus Gon�alves de Souza | RA: 119122458
		// Nome: Vin�cius Gon�alves de Souza | RA: 119122170
		
			
		int [][] matrizSoma = {{0,1,2,3,4,5,6,7,8,9},{0,1,2,3,4,5,6,7,8,9}};
		Scanner n1 = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");
		int num1 = n1.nextInt();
		
		Scanner n2 = new Scanner(System.in);
		System.out.print("Digite o segundo n�mero: ");
		int num2 = n2.nextInt();
		
		System.out.print("A soma dos valores �: ");
		System.out.print((matrizSoma[0][num1]) + matrizSoma[1][num2]);
		
	}

}
