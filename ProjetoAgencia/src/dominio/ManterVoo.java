package dominio;



public class ManterVoo {
	
	

	private String local ;
	private String destino;
	private String origem ;
	
	public ManterVoo() {
		super();
	}

	public ManterVoo(String local, String destino, String origem, Integer id) {
		super();
		this.local = local;
		this.destino = destino;
		this.origem = origem;
		this.id = id;
	}

	/**
	 * Atributo identificador do objeto.
	 */
	protected Integer id;

	/**
	 * M�todo para obter o n�mero identificador do objeto.
	 * 
	 * @return o n�mero identificador do objeto.
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * M�todo para configurar o n�mero identificador do objeto.
	 * 
	 * @param id
	 *            � o n�mero identificador a ser usado.
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

		
	
}
