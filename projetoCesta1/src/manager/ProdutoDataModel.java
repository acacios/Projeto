package manager;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import entity.Produto;

public class ProdutoDataModel extends ListDataModel implements SelectableDataModel<Produto> {
 //Primeiro o DataModel depois o ManagerBean

	public ProdutoDataModel() {
	}

	 ProdutoDataModel(List<Produto> lista) {
		 super(lista);
	}

	
	@Override
	public Produto getRowData(String key) {
	   List<Produto> produtos = (List<Produto>) getWrappedData();
	   for (Produto p : produtos){
		    if (p.getIdProduto().equals(Integer.parseInt(key))){
		     return  p; 	
		    }
	   }
 		return null;
	}

	@Override
	public Object getRowKey(Produto p) {
		return p.getIdProduto();
	}

}
