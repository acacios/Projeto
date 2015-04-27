package persistence;

import entity.Cliente;

public class ClienteDao extends GenericDao<Cliente, Integer>{
	
	public ClienteDao() {
    super(new Cliente());
    }

}
