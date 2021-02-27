public class Ex1 {

	private static int auxTam;
	private static int [] fila;
	
	public static void main(String[] args) {
		
		auxTam = 0;
		fila = new int [5];
		
		System.out.println("Fila: ");
		
		printFila(fila);
		System.out.println("\n------------------------");
		
		System.out.println("Adiciona um elemento 20 \n"
				+ "------------------------");
		addFila(20);
		
		System.out.println("Qual o índice do início da fila? R: " + 0);
		System.out.println("Qual é o elemento do início da fila? R: " +fila[0]);
		System.out.println("Qual é o índice do final da fila? R: " +(auxTam-1));
		System.out.println("Qual é o elemento do final da fila? R: " +fila[auxTam-1]);
		System.out.println("Adiciona um elemento 10 \n"
				+ "------------------------");
		
		printFila(fila);
		System.out.println("\n------------------------");
		
		addFila(10);
		
		System.out.println("Qual o índice do início da fila? R: " + 0);
		System.out.println("Qual é o elemento do início da fila? R: " +fila[0]);
		System.out.println("Qual é o índice do final da fila? R: " +(auxTam-1));
		System.out.println("Qual é o elemento do final da fila? R: " +fila[auxTam-1]);
		System.out.println("------------------------");


	}
	
	private static void addFila(int add) {
		
		fila[auxTam] = add;
		auxTam++;
	}
	
	private static void printFila(int [] fila) {
		for(int i = 0; i<fila.length; i++) {
			System.out.print(fila[i] + " | ");
		}
	}

}