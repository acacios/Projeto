package segundo_teste;

/**   
 *Abaixo segue uma classe contendo uma única propriedade e três (3) métodos públicos. 
 *O método adiciona(int valor) deve acrescentar ao valor retido pela propriedade de instância 
 *valor o valor fornecido como argumento a este método
 *(em um cenário real provavelmente você não estará criando testes de unidade para tal método, 
 *contudo, é suficiente para ilustrar o emprego do JUnit). 
 * **/
public class Valor {
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void adiciona(int valor) {
		this.valor += valor;
	}
}
