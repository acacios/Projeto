package manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import persistence.VendaDao;
import entity.Cliente;
import entity.Produto;
import entity.Venda;

@ManagedBean(name="smb")
@SessionScoped
public class SaidaManagerBean {

	private Produto[] listaProd;
	private Cliente cliente;
	
	
	public SaidaManagerBean() {
     cliente = new Cliente();
    }

	public Produto[] getListaProd() {
		return listaProd;
	}

	public void setListaProd(Produto[] listaProd) {
		this.listaProd = listaProd;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void grava(){
		   Venda v= new Venda();
    	    v.setDataVenda(new Date());
   		     List <Produto> lista = new ArrayList<Produto>();
		    for(Produto p : listaProd){ //listaProd foram os produtos escolhidos
		    	lista.add(p);
		    }
		    //nome já foi digitado
		    cliente.setVenda(v);
		    v.setCliente(cliente); //antes de gravar venda seta todos
		    v.setProdutos(lista);
		    try{
		    	new VendaDao().save(v);
		   FacesContext.getCurrentInstance().addMessage("form2", new FacesMessage("Dados Gravados ..."));
		   listaProd=null;
		   cliente=new Cliente();
		    }catch(Exception ex){
		   FacesContext.getCurrentInstance().addMessage("form2", new FacesMessage("error" +ex.getMessage()));
		    }
	}
	
	
}
