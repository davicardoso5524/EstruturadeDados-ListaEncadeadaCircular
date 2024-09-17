
public class ListaCircular {
	private No cabeca = null;
	private No cauda = null;
	
	// Metódo Inserir no final da lista Circular
	public void inserir(int dado) {
		No novoNo = new No(dado);
		if (cabeca == null) {
			cabeca = novoNo;
			cauda = novoNo;
			cauda.proximo = cabeca;
		} else {
			cauda.proximo = novoNo;
			cauda = novoNo;
			cauda.proximo = cabeca;
		}
	}
	
	
	// Metódo Pra percorrer a lista ou Exibi-lá
	public void percorrer() {
		if (cabeca == null) {
			System.out.println("A lista está vazia");
			return;
		}
		No atual = cabeca;
		do {
			System.out.print(atual.dado + " -> ");
			atual = atual.proximo;
		} while(atual != cabeca);
		System.out.print("Aponta para cabeca");
		System.out.println();
	}
	
	// Metódo para remover um nó da lista
	public void remover(int valor) {
		if (cabeca == null) {
			System.out.println("A lista está vazia");
			return;
		}
		
		No atual = cabeca;
		No anterior = null;
		
		do {
			if (atual.dado == valor) {
				if (atual == cabeca) {
					cabeca = cabeca.proximo;
					cauda.proximo = cabeca;
				} else if(atual == cauda) { 
					System.out.println("entrou na condição que o valor é o msm da cauda");
					cauda = anterior;
					cauda.proximo = cabeca;
				} else {
					anterior.proximo = atual.proximo;
				}
				System.out.println("Elemento " + valor + " removido.");
                return;
			}
			anterior = atual;
			atual = atual.proximo;
		}while (atual != cabeca);
		System.out.println("Elemento " + valor + " não encontrado.");
	}
}
