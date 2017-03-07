package POO;

public class Lista {
	Node first;
	Node last;
	int tamanho = 0;
	public Lista(int oi){
		Node no = new Node(oi);
		no.anterior = null;
		no.proximo = null;
		this.first = no;
		this.last = no;
	}
	public void append(int val){
		Node oi = new Node(val);
		oi.anterior = this.last;
		oi.proximo = null;
		this.last.proximo = oi;
		this.last = oi;
		this.tamanho += 1;
	}
	public void imprimir(){
		System.out.println(this.first);
		Node hertz = this.first;
		for(int i = 0; i < this.tamanho;i++){
			System.out.println(hertz.proximo);
			hertz = hertz.proximo;
		}
	}
	public int get(int index){
		Node hertz = this.first;
		for(int i = 0; i < this.tamanho; i++){
			if(i == index){
				return hertz.valor;
			}
			hertz = hertz.proximo;
		}
		return 0;
	}
}
