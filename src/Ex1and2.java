import javax.swing.JOptionPane;

public class Ex1and2 {

	public static void main(String[] args) {
		
		Fila opFila = new Fila();
		Pilha opPilha = new Pilha();
		TESTE opTeste = new TESTE();
		
		int opc = 0;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção desejada: \n"
					+ "1 - Adicionar elemento à fila; \n"
					+ "2 - Remover elemento da fila; \n"
					+ "3 - Adicionar elemento à pilha; \n"
					+ "4 - Remover elemento da pilha; \n"
					+ "5 - ENTRAR NO MENU TESTE COM NOVAS FUNCIONALIDADES; \n"
					+ "0 - Sair da aplicação"));
			
			switch(opc) {
			case 1: opFila.addFila();
			opFila.printlista();
			break;
			case 2: opFila.removeFila();
			opFila.printlista();
			break;
			case 3: opPilha.addPilha();
			opPilha.printlista();
			break;
			case 4: opPilha.removePilha();
			opPilha.printlista();
			break;
			case 5: opTeste.menu();
			break;
			
			}
		} while (opc!=0);
		
	}

}
