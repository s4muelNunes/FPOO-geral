package pacote;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("C�digo - Cargo");
		System.out.println(" 1 - Escritur�rio");
		System.out.println(" 2 - Secret�rio");
		System.out.println(" 3 - Caixa");
		System.out.println(" 4 - Gerente");
		System.out.println(" 5 - Diretor");
		
		System.out.println("Digite o C�digo do Cargo: ");
		int codigoCargo = scanner.nextInt();
		
		System.out.println("Digite o Sal�rio Atual");
		double sal�rioAtual = scanner.nextDouble();
		
		double percentualAumento = 0.0;
		String cargo = "";
		
		switch (codigoCargo) {
		case 1:
			percentualAumento = 0.5;
			cargo = "Escritur�rio";
			break;
		case 2:
			percentualAumento = 0.35;
			cargo = "Secret�rio";
			break;
		case 3:
			percentualAumento = 0.2;
			cargo = "Caixa";
			break;
		case 4:
			percentualAumento = 0.1;
			cargo = "Gerente";
			break;
		case 5:
			percentualAumento = 0.0;
			cargo = "Diretor";
			break;
		default:
			System.out.println("C�digo de Cargo Inv�lido");
			return;
		}
		
		double aumento = salarioAtual * percentualAumento;
		double novoSalario = salarioAtual + aumento;
		
		System.out.println("Cargo: " + cargo);
		System.out.println("Valor do Aumento: " + aumento);
		System.out.println("Novo sal�rio: " + novoSalario);
		
		
		
		
		
		
		
		
		
	}

}
