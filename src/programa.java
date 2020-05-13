import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int escolaridade, anos, esc, experiencia;
		char viagem, habilitacao;
		
		// LEITURA DA ESCOLARIDADE
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.printf("Digite uma op��o: ");
		escolaridade = sc.nextInt();
		
		// LEITURA DOS OUTROS DADOS
		System.out.printf("%nVoc� tem quantos anos de experi�ncia profissional? ");
		anos = sc.nextInt();
		System.out.printf("Voc� tem disponibilidade para viajar (S/N)? ");
		viagem = sc.next().charAt(0);
		System.out.printf("Voc� tem habilita��o de motorista (S/N)? ");
		habilitacao = sc.next().charAt(0);
		
		
		//calculo da experiencia e escolaridade
		if(escolaridade == 1) {
			esc = 10;
		} else {
			if(escolaridade == 2) {
				esc = 20;
			} else {
				if(escolaridade == 3) {
					esc = 30;
				}else {
					esc = 40;
				}
			}
		}
		if(anos == 0) {
			experiencia = 0; 
		} else {
			if(anos > 0 && anos <= 2) {
				experiencia = 10;
			}else {
				if(anos > 2 && anos <= 5) {
					experiencia = 20;
				}else {
					experiencia = 40;
				}
			}
		}
		System.out.printf("%nPontos por escolaridade: %d%n", esc);
		System.out.println("Pontos por experi�ncia: " + experiencia);
		
		sc.close();
	}

}
