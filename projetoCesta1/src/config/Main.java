package config;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Main {
 
	
	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration().
				configure("config/oracle_hibernate.cfg.xml");
		new SchemaExport(cfg).create(true,true);
		
/*		
insert into produto(idProduto,nomeProduto,quantidade,preco) values(seq_produto.nextval,'arroz',1,3);
insert into produto(idProduto,nomeProduto,quantidade,preco) values(seq_produto.nextval,'feijao',2,5);
insert into produto(idProduto,nomeProduto,quantidade,preco) values(seq_produto.nextval,'macarrao',1,10);
insert into produto(idProduto,nomeProduto,quantidade,preco) values(seq_produto.nextval,'acucar',1,5);
commit;		
	*/
		
	}
	
	
}
