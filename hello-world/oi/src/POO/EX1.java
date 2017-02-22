package POO;

import java.util.Scanner;

public class EX1 {
		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			System.out.println(Fibonacci(n));
			System.out.println(Fat(n));
		}
		public static int Fibonacci(int n){
			int number1 = 0;
			int number2 = 1;
			int soma = 0;
			for(int i = 0; i < n-2; i++ ){
				soma = number1+ number2;
				number1= number2;
				number2 = soma;
			}
			return soma;
		}
		public static int Fat(int n){;
			int fatorial = 1;
			for(int hello = n; hello > 0; hello--){
				fatorial = fatorial * hello;
			}
			return fatorial;
		}
}
