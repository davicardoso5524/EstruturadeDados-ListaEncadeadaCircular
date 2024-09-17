
public class App {

	public static void main(String[] args) {
		ListaCircular lista = new ListaCircular();
		
		lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);

        System.out.println("Elementos da lista:");
        lista.percorrer();  // Exibe: 10 20 30 40

        lista.remover(30);
        System.out.println("Após remover 30:");
        lista.percorrer();  // Exibe: 10 20 40
	}

}
