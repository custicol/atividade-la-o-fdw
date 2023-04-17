package laçofdw;
import java.util.Scanner;
public class LaçoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int idade = 0, menor21 = 0, maior50 = 0;
		
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		
		while (idade >= 0) {
			if(idade < 21) {
				menor21 ++;
			} else if (idade > 50) {
				maior50 ++;
			}
			idade= sc.nextInt();
		}
		
		System.out.println("Total de pessoas menores que 21 anos: " + menor21);
		System.out.println("Total de pessoas maiores que 50 anos:" + maior50);
	}

}
