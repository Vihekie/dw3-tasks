package POO;

public class TestaFunc {
	public static void main(String[] args){
		Funcionario Jao = new Funcionario();
		Jao.nome = "João";
		Jao.date = "22/02/2017";
		Jao.dep = "IT";
		Jao.salario = 100.00;
		Jao.recebeAumento(10);
		System.out.println(Jao.salario);
		System.out.println(Jao.calculaGanhoAnual());
		Funcionario f1 = new Funcionario();
		f1.nome = "Danilo";
		f1.salario = 100;
		Funcionario f2 = new Funcionario();
		f2.nome = "Danilo";
		f2.salario = 100;
		if (f1 == f2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		Funcionario f11 = new Funcionario();
		f1.nome = "Hugo";
		f1.salario = 100;
		Funcionario f22 = f11;
		if (f11 == f22) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
		Data data = new Data();
		Jao.dataDeEntrada = data;
		Jao.dataDeEntrada.dia = 22;
		Jao.dataDeEntrada.mes = 02;
		Jao.dataDeEntrada.ano = 2017;
	}
}
