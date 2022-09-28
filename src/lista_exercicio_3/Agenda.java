package lista_exercicio_3;

public class Agenda {
    // Atributos
    private double[] itens;
    private int topo;
    private int tam_max;

	public void setTam_max(int tam_max) {
		this.tam_max = tam_max;
	}
	
	public Agenda(int n)  {
		itens = new double[n];
        tam_max = n;
        topo = 0;
    }

    public void push(double valor) {
        itens[topo] = valor;
        topo++;
    }

    public void pop() {
        topo--;
    }

    public double top() {
        return itens[topo - 1];
    }

    public boolean empty() {
        return (topo == 0);
    }

    public boolean full() {
        return (topo == tam_max);
    }

    public int size() {
        return topo;
    }


}
