package oi;

/* exercicio 2.14, 1) 

public class oi {
	public static void main(String[] args){
		System.out.println(args);
	}
}

*/

/* exercicio 2.14, 2) 

public class oi {
	public static void main(String[] args){
		System.out.println(args);
		System.out.println("segunda linha de texto");
	}
}

*/

/* exercicio 2.14, 3) 

public class oi {
	public static void main(String[] args){
		System.out.println("Hello World \n Olá Mundo);
	}
}

*/
/*
 exercicio 3.3, 1) 
 

public class oi{
	public static void main(String[] args){
		int gastosJaneiro = 15000;
		int gastosMarco = 17000;
		int gastosFevereiro = 23000;
		int gastosTrimestre = gastosJaneiro + gastosMarco + gastosFevereiro;
		System.out.println(gastosTrimestre);
	}
}
*/

/* exercicio 3.3, 2) 

public class oi{
	public static void main(String[] args){
		int gastosJaneiro = 15000;
		int gastosMarco = 17000;
		int gastosFevereiro = 23000;
		int gastosTrimestre = gastosJaneiro + gastosMarco + gastosFevereiro;
		double MediaMensal = gastosTrimestre / 3;
		System.out.println(gastosTrimestre);
		System.out.println(MediaMensal);
	}
}
*/

/* exercicio 3.13, 1) 


public class oi {
	public static void main(String[] args){
		for(int i = 150; i <= 300; i++){
			System.out.println(i);
		}
	}
}
*/

/* exercicio 3.13, 2) 


public class oi {
	public static void main(String[] args){
		for(int i = 1;i <= 1000;i++){
			System.out.println(i);
		}
	}
}
*/

/* exercicio 3.13, 2) 


public class oi {
	public static void main(String[] args){
		for(int i = 1;i <= 1000;i++){
			System.out.println(i);
		}
	}
}
*/

/* exercicio 3.13, 3) 


public class oi {
	public static void main(String[] args){
		for(int i = 1; i <= 100; i++){
			if(i % 3 == 0){
				System.out.println(i);
			}
		}
	}
}
*/

/* exercicio 3.13, 4) 


public class oi {
	public static void main(String[] args){
		for(int i = 1; i <=10; i++){
			int fatorial = 1;
			for(int n = i; n > 0; n-- ){
				fatorial = fatorial * n;
			}
			System.out.println(fatorial);
		}
	}
}
*/

/* exercicio 3.13, 5) 


public class oi {
	public static void main(String[] args){
		for(int i = 1; i <= 40; i++){
			long fatorial = 1;
			for(int n = i; n > 0; n-- ){
				fatorial = fatorial * n;
			}
			System.out.println(fatorial);
		}
	}
}
*/

/* exercicio 3.13, 6) 

public class oi{
	public static void main(String[] args){
		int number1 = 0;
		int number2 = 1;
		int soma = 0;
		System.out.print(number1);
		System.out.print(number2);
		for(int i = 0; i < 100; i++ ){
			soma = number1+ number2;
			number1= number2;
			number2 = soma;
			if(soma >= 100){
				System.out.print(number2);
				break;
			}
			System.out.print(number2);
		}
	}
}
*/
/* exercicio 3.13, 7) 

import java.util.Scanner;
public class oi {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		while(x >= 1){
			System.out.println(x);
			if(x == 1){
				break;
			}
			if(x % 2 == 0){
				x = x /2;
			}else{
				x = 3*x +1;
			}
		}
	}
}
*/
/* exercicio 3.13, 8) 

import java.util.Scanner;
public class oi {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		for(int var = 1; var <= x; var ++){
			String oi = "";
			for(int i = 1; i <= var; i++){
				oi = oi +" " + (char) var * i;
			}
			System.out.println(oi);
		}
	}
}
*/



