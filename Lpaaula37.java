package LPAlore;
import java.util.Scanner;
public class Lpaaula37 {

	public static void main(String[] args) {
		
		int a [] = new int[5];
		int soma = 0;
		
		Scanner ler = new Scanner (System.in);
		
		for (int i =0; i<5; i++) {
		System.out.println("Informe um valor " + i+ ":");
		a[i] = ler.nextInt();
		}
		for (int i =0; i<5; i++) {
		System.out.println(a[i]);
		soma = soma+(a[i]);
		{	
		}
		if (soma>15) {
		System.out.println("O resultado da conta é: "+soma);
		}
		else {
		System.out.println("O resultado da conta é menor que 15");
		}
	}
}
}
