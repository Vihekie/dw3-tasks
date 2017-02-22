package POO;

public class Data {
	int dia;
	int mes;
	int ano;
	public String stringDate(){
		String oi = "";
		oi = oi + String.valueOf(dia) + "/" + String.valueOf(mes) + "/" + String.valueOf(ano);
		return oi;
	}
}
