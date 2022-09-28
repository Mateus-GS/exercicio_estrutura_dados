package lista_exercicio_3;

public class Main {

	public static void main(String[] args) {
		Agenda a = new Agenda(4);
		if (!a.full()) {
			a.push(2.0);
		} else {
			System.out.println("Agenda cheia");
		}
		
//		if (!a.full()) {
//			a.push(52.0);
//		} else {
//			System.out.println("Agenda cheia");
//		}
//		
//		if (!a.full()) {
//			a.push(50.0);
//		} else {
//			System.out.println("Agenda cheia");
//		}
//		
//		if (!a.full()) {
//			a.push(21.0);
//		} else {
//			System.out.println("Agenda cheia");
//		}
//		
		
	}

}
