package config;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import persistence.UsuarioDao;

import entity.Usuario;

public class Main {

	public static void main(String[] args) {
		
		new SchemaExport(new AnnotationConfiguration()
		.configure("config/oracle_hibernate.cfg.xml")).create(true, true);
		
		try{
			
			Usuario u1 = new Usuario(null, "acacio", "123");
			Usuario u2 = new Usuario(null, "garra", "1234");

			UsuarioDao ud = new UsuarioDao();
			ud.cadastrar(u1);
			ud.cadastrar(u2);
			
			System.out.println("Cadastrado");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
