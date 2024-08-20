package controlefluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o 1 parametro ");
		int parametroUm = input.nextInt();
		System.out.println("Digite o 2 parametro ");
		int parametroDois = input.nextInt();
		
		try {
			contar(parametroUm,parametroDois);
		}catch(ParametrosInvalidosException e){
			System.out.println("O segundo numero precisa ser maior que o primeiro");
		}
		
		
		
		
		
		
		
		
		
		input.close();

	}
	
	static void contar (int num1 , int num2) throws ParametrosInvalidosException{
		if(num1 > num2) {

			throw new ParametrosInvalidosException();
			
		}
		int contagem = num2 - num1;
		
		for(int i = 0; i < contagem;i++) {
			System.out.printf("imprimindo o numero %d%n ",i);
		}
	}

}
