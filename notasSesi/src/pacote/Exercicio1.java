package pacote;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner objScanner = new Scanner(System.in);
		String planos;
		
		System.out.println("Informe o Plano");
		
		planos = objScanner.next();
		
		if(planos.equalsIgnoreCase("Basico")) {
			System.out.println("Valor R$ 150,00");
		}
		
		else if(planos.equalsIgnoreCase("Bronze")) {
			System.out.println("Valor R$ 220,00");
		}
		else if(planos.equalsIgnoreCase("Prata")) {
			System.out.println("Valor R$ 310,00");
		}
		else if(planos.equalsIgnoreCase("Ouro")) {
			System.out.println("Valor R$ 450,00");
		}
		
		else {
			System.out.println("Plano Invalido");
		}
		
	}
}



