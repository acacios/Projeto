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
	 * Método para obter o número identificador do objeto.
	 * 
	 * @return o número identificador do objeto.
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Método para configurar o número identificador do objeto.
	 * 
	 * @param id
	 *            é o número identificador a ser usado.
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
