import javax.swing.JOptionPane;

public class Pilha {

	private int auxTam;
	private int [] pilha;
	
	public Pilha() {
		auxTam = 0;
		pilha = new int [5];
	}
	
	public void addPilha() {
		int number = getInt();
		if(auxTam < pilha.length) {
			pilha[auxTam] = number;
			auxTam++;
		}
		else {
			System.out.println("Lista cheia, não é possível adicionar no final.");
		}
	}
	
	public void addPilhaTeste(int number) {
		if(auxTam < pilha.length) {
			pilha[auxTam] = number;
			auxTam++;
		}
		else {
			System.out.println("Lista cheia, não é possível adicionar no final.");
		}
	}
	
	public int removePilha() {
		int removido = 0; 
		if(auxTam > 0) {
			removido = pilha[auxTam-1];
			pilha[auxTam-1] = 0;
			auxTam--;
			return removido;
		}
		else {
			System.out.println("Não há elementos na lista");
			return removido;
		}
	}
	
	public void printlista(){
		if (auxTam == 0) {
			System.out.println("Pilha vazia!");
		}
		else {
			System.out.println("PILHA: ");
			for (int i = 0; i<pilha.length; i++) {
				if(pilha[i] != 0) {
					System.out.print(pilha[i]);
					System.out.print(" | ");
				}
			}
			System.out.println("");
		}
		if(auxTam>0) {
			System.out.println("Qual o índice do início da pilha? R: " + 0);
			System.out.println("Qual é o elemento do início da pilha? R: " +pilha[0]);
			System.out.println("Qual é o índice do final da pilha? R: " +(auxTam-1));
			System.out.println("Qual é o elemento do final da pilha? R: " +pilha[auxTam-1]);
		}
	}
	
	public void printlistaTeste(){
		if (auxTam == 0) {
			System.out.println("Pilha vazia!");
		}
		else {
			System.out.println("Você removeu um elemento da fila e adicionou a PILHA: ");
			for (int i = 0; i<pilha.length; i++) {
				if(pilha[i] != 0) {
					System.out.print(pilha[i]);
					System.out.print(" | ");
				}
			}
			System.out.println("");
		}
		if(auxTam>0 && auxTam<pilha.length) {
			System.out.println("A pilha foi atualizada com o elemento removido da fila. Numero add: " +pilha[auxTam-1]);
		}
	}
	
	public int getInt() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para ser adicionado na pilha: "));
		return numero;
	}
	
}
