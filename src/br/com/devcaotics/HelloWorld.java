package br.com.devcaotics;

import java.util.Scanner;

public class HelloWorld
{
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite a sua idade: ");
		idade = Integer.parseInt(entrada.nextLine());
		
		if (idade >= 65)
			System.out.println("Você já consegue se aposentar, ora pois!");
		else if (idade >= 18)
			System.out.println("Você é maior de idade.");
		else
			System.out.println("Você não é maior de idade. A-ha!!!");
		
		System.out.println("Aliás: Hello World!!!\n");
		
		System.out.println("Resolvendo conflitos entre branchs...\n");

		System.out.println("branch main...");
		System.out.println("Fazendo alterações na branch 'main'.");
		System.out.println("Autor: 'Lucas Gomes de Oliveira'\n");

		System.out.println("branch hotfix...");
		System.out.println("Esta é a branch 'Hotfix'.");
		System.out.println("Lorem Ipsum!\n");
		
		System.out.println("conflitos resolvido.");
		System.out.println("Manteve-se o código de ambas as branchs.");
		
		entrada.close();
	}
}
