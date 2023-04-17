package laçofdw;
import java.util.Scanner;
public class LaçoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2, i = 0;
		
		System.out.print("Digite o primeiro numero: ");
		num1 = input.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		num2 = input.nextInt();
		
		if (num1 >= num2) {
			System.out.println("intervalo invalido");
			return;
		}
		
		System.out.println("Multiplos de 3 e 5 no intervalo de " + num1 + " e " + num2 + ": ");
		for (i = num1; i <= num2; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
				
			}
		}
	}

}
