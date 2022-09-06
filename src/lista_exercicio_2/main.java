package lista_exercicio_2;
import java.util.*;

public class main {

	public static void main(String[] args) {
		
		// Nome: Mateus Goncalves de Souza | RA: 119122458
		// Nome: Vinicius Goncalves de Souza | RA: 119122170
		
		double saldoInicial;
		int numConta, agenciaConta, qts;
		String nomeConta, cpfConta;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Quantas contas deseja criar: ");
		qts = ler.nextInt();
		
		conta[] contas = new conta[qts];
		
		for (int i = 0; i < contas.length; i++) {
			System.out.println("======= Criando nova conta ==========");
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
			
			contas[i] = new conta(saldoInicial, numConta, agenciaConta, nomeConta, cpfConta );
			
		}
		
		contas[0].Transferir(contas[1], 100);
		contas[1].ExibirSaldo();
		contas[0].ExibirSaldo();
			
		
	}

}
