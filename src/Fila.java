import javax.swing.JOptionPane;

public class Fila {

	private int auxTam;
	private int [] fila;
	
	public Fila() {
		auxTam = 0;
		fila = new int [5];
	}
	
	public void addFila() {
		int number = getInt();
		if(auxTam < fila.length) {
			fila[auxTam] = number;
			auxTam++;
		}
		else {
			System.out.println("Fila cheia, não é possível adicionar no final.");
		}
	}
	
	public void addFilaTeste(int number) {
		if(auxTam < fila.length) {
			fila[auxTam] = number;
			auxTam++;
		}
		else {
			System.out.println("Fila cheia, não é possível adicionar no final.");
		}
	}
	
	public int	removeFila() {
		int removido = 0;
		if(auxTam > 0) {
			removido = fila[0];
			for(int i = 0; i<fila.length-1; i++) {
				fila[i] = fila[i+1];
			}
			fila[auxTam-1] = 0;
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
			System.out.println("Fila vazia!");
		}
		else {
			System.out.println("FILA: ");
			for (int i = 0; i<fila.length; i++) {
				if(fila[i] != 0) {
					System.out.print(fila[i]);
					System.out.print(" | ");
				}
			}
			System.out.println("");
		}
		if(auxTam>0) {
			System.out.println("Qual o índice do início da fila? R: " + 0);
			System.out.println("Qual é o elemento do início da fila? R: " +fila[0]);
			System.out.println("Qual é o índice do final da fila? R: " +(auxTam-1));
			System.out.println("Qual é o elemento do final da fila? R: " +fila[auxTam-1]);
		}
	}
	
	public void printlistaTeste(){
		if (auxTam == 0) {
			System.out.println("Fila vazia!");
		}
		else {
			System.out.println("Você removeu um elemento da pilha e adicionou a FILA: ");
			for (int i = 0; i<fila.length; i++) {
				if(fila[i] != 0) {
					System.out.print(fila[i]);
					System.out.print(" | ");
				}
			}
			System.out.println("");
		}
		if(auxTam>0 && auxTam<fila.length) {
			System.out.println("A Fila foi atualizada com o elemento removido da pilha. Numero add: " +fila[auxTam-1]);
		}
	}
	
	public int getInt() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para ser adicionado na fila: "));
		return numero;
	}
	
}
