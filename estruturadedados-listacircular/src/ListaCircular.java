
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
		
	}
	
}
