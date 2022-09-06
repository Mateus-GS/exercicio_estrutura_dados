package lista_exercicio_2;

public class conta {
    
    private double Saldo ;
    private int Num ;
    private int Agencia ;
    private String Nome;
    private String Cpf;
    
    
	public conta(double saldo, int num, int agencia, String nome, String cpf) {
		super();
		Saldo = saldo;
		Num = num;
		Agencia = agencia;
		Nome = nome;
		Cpf = cpf;
	}
    
    
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	public int getNum() {
		return Num;
	}
	public void setNum(int num) {
		Num = num;
	}
	public int getAgencia() {
		return Agencia;
	}
	public void setAgencia(int agencia) {
		Agencia = agencia;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	
	public void Depositar(double deposito ) {
		
		this.Saldo +=  deposito;
		System.out.println("Conta " + this.Nome + " Saldo atual " + this.Saldo);
	}
	
	public void Sacar (double valorSaque ) {
		if ( valorSaque > this.Saldo) {
			System.out.println("Saldo Insuficiente!");
		}else {
			this.Saldo -= valorSaque;
			System.out.println("Conta " + this.Nome + " Saldo atual " + this.Saldo);
		}
	}
	
	public void ExibirSaldo () {
	System.out.println( "Saldo atual : " + this.Saldo);
	}

	public void Transferir (conta contaRecebidor, double valorTranferencia) {
		contaRecebidor.Saldo += valorTranferencia;
		this.Saldo -= valorTranferencia;

	}

    
}
