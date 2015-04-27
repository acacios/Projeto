package persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entity.Cliente;
import entity.Produto;
import entity.Venda;

public class VendaDao extends GenericDao<Venda, Integer>{
	
	 public VendaDao(){
		 super(new Venda());
	 }

	 
	 public static void main(String[] args) {
		
		 Venda v= new Venda();
    	 v.setDataVenda(new Date());
    	 Produto p1 = new Produto(null,"cafe",7.,10);
    	 
		     List <Produto> lista = new ArrayList<Produto>();
		    
		     lista.add(p1);
		    
		    Cliente c= new Cliente(null,"marcelo");
		    c.setVenda(v);
		   
		    v.setCliente(c); //antes de gravar venda seta todos
		    v.setProdutos(lista);
		    try{
		    
		    	new VendaDao().save(v);
		      System.out.println("Dados Gravados ...");
		    }catch(Exception ex){
		    	System.out.println("Error :" + ex.getMessage());
		    }
		 
		 
		 
		 
	}
}
