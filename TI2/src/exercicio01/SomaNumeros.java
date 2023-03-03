package exercicio01;

import java.util.*;

public class SomaNumeros {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float num1,num2,soma;
		
		System.out.println("Insira um número");
		num1 = sc.nextFloat();
		System.out.println("Insira outro número");
		num2 = sc.nextFloat();
		soma = num1 + num2;
		System.out.println(soma);
	}
}
