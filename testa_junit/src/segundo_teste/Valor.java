package segundo_teste;

/**   
 *Abaixo segue uma classe contendo uma �nica propriedade e tr�s (3) m�todos p�blicos. 
 *O m�todo adiciona(int valor) deve acrescentar ao valor retido pela propriedade de inst�ncia 
 *valor o valor fornecido como argumento a este m�todo
 *(em um cen�rio real provavelmente voc� n�o estar� criando testes de unidade para tal m�todo, 
 *contudo, � suficiente para ilustrar o emprego do JUnit). 
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
