package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos mostrar um intervalo de intercessão entre dois números, fique atento, o primeiro número precisa ser menor que o segundo!");
		try {
		System.out.println("Digite o primeiro número:");
		int primeiroNumero = sc.nextInt();
		System.out.println("Digite o segundo número:");
		int segundoNumero = sc.nextInt();
			contar(primeiroNumero, segundoNumero);
		}catch(InputMismatchException e) {
			System.out.println("Você deve inserir apenas números inteiros!");
		}catch(ParametrosInvalidosException e) {
			System.out.println("O primeiro número deve ser maior que o segundo!");
		}finally {
			System.out.println("Você chegou ao fim do Programa!");
		}
		
	}
	static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
		if(primeiroNumero > segundoNumero) {
			throw new ParametrosInvalidosException("O primeiro Número deve ser menor que o segundo!");
		}
		else {
		for(int i = primeiroNumero; i <= segundoNumero; i++) {
			System.out.println(i);
			}
		}
	}
	
	
	
	}


