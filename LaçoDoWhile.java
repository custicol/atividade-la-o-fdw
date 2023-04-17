package laçofdw;
import java.util.Scanner;
public class LaçoDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero, soma = 0;
		
		do {
			System.out.println("digite um numero inteiro ou numero 0 para sair: ");
			numero = sc.nextInt();
			
			if (numero > 0) {
				soma += numero;
			}
		}  while (numero != 0);
		
		System.out.println("a soma dos numeros digitados é: " + soma);
	}

}
