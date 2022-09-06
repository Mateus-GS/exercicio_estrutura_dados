package lista_exercicio_2;
import java.util.*;

public class main {

	public static void main(String[] args) {
//		conta Vinicius = new conta(1000, 50, 1400, "Vinicius", "000.000.000-00" );
//		conta Mateus = new conta(1000, 20, 1400, "Mateus", "000.000.000-00" );
//		
//		Vinicius.Transferir(Mateus, 100);
//		Mateus.ExibirSaldo();
//		Vinicius.ExibirSaldo();
		double saldoInicial;
		int numConta;
		int agenciaConta;
		String nomeConta;
		String cpfConta;
		int posicao = 1;
		
		Scanner ler = new Scanner(System.in);
		conta[] contas;
		
		contas = new conta [5];
		for (int i = 0; i < contas.length; i++) {
			
			System.out.printf("Saldo Inicial: ");
			saldoInicial = ler.nextDouble();
			System.out.printf("Numero conta: ");
			numConta = ler.nextInt();
			System.out.printf("Agencia: ");
			agenciaConta = ler.nextInt();
			System.out.printf("Nome: ");
			nomeConta = ler.next();
			System.out.printf("CPF: ");
			cpfConta = ler.next();
			
			//conta novaconta[i] = new conta(saldoInicial, numConta, agenciaConta, nomeConta, cpfConta );
			
		}	
			
		
	}

}
