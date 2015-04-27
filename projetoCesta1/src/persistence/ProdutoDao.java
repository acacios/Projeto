package persistence;

import entity.Produto;

public class ProdutoDao extends GenericDao<Produto, Integer> {
	
	public ProdutoDao(){
		super(new Produto());
	}

}
