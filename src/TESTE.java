import javax.swing.JOptionPane;

public class TESTE {

	Fila op = new Fila();
	Pilha op2 = new Pilha();
	
	public void menu() {
		
		int removidoFila = 0;
		int removidoPilha = 0;
		
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção desejada: \n"
					+ "1 - Adicionar elemento à fila; \n"
					+ "2 - Remover elemento da fila e adicionar ao topo da pilha; \n"
					+ "3 - Adicionar elemento à pilha; \n"
					+ "4 - Remover elemento da pilha e adicionar ao final da fila; \n"
					+ "0 - Sair da aplicação"));
			
			switch(opc) {
			case 1: op.addFila();
			op.printlista();
			break;
			case 2: removidoFila = op.removeFila();
			op2.addPilhaTeste(removidoFila);
			op2.printlistaTeste();
			break;
			case 3: op2.addPilha();
			op2.printlista();
			break;
			case 4: removidoPilha = op2.removePilha();
			op.addFilaTeste(removidoPilha);
			op.printlistaTeste();
			break;
			
			}
		} while (opc!=0);
		
	}
	
	
	
}
