package pacote;
import java.util.Scanner;


public class M�dia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		int nota1;
		
		int nota2;
		
		int nota3;
		
		int nota4;
		
		int media;
		
		System.out.println("digite as notas");
		
		System.out.println("nota1");
		nota1 = scanner.nextInt();
		
		System.out.println("nota2");
		nota2 = scanner.nextInt();
		
		System.out.println("nota3");
		nota3 = scanner.nextInt();
		
		System.out.println("nota4");
		nota4 = scanner.nextInt();

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println(" SUA M�DIA FOI " + media);
		
		if( media > 7 ) {
			System.out.println("Aprovado");
		
		}else if (media >= 5&& media <= 7) {
			System.out.println("Recupera��o");
			
		}else {
			System.out.println("reprovado");
		
		}
		

	}

}
