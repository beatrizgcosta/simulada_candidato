import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int escolaridade;
		
		// LEITURA DA ESCOLARIDADE
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.printf("Digite uma op��o: ");
		escolaridade = sc.nextInt();
		
		sc.close();
	}

}