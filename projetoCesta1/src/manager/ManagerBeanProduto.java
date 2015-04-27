package manager;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import persistence.ProdutoDao;

@ManagedBean(name="mb")
@RequestScoped
public class ManagerBeanProduto {

	 private ProdutoDataModel lista; //O dataModel que busca do banco irá 
	 //alimentar a tabela ....
	 
	 public ManagerBeanProduto() {
	 }

	public ProdutoDataModel getLista() {
		try{
			lista = new ProdutoDataModel(new ProdutoDao().findAll());
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return lista;
	}

	public void setLista(ProdutoDataModel lista) {
		this.lista = lista;
	}

	  
	
	
}
