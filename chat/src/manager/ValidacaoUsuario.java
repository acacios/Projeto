package manager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import entity.Login;

public class ValidacaoUsuario {
	
	public Boolean isIdUsuario(Login u){
		 if (u.getIdLogin() >0)
  		 return true;
			 return false;
	}
	
	public Boolean isNome(Login u){ 
		Pattern p = Pattern.compile("[A-Z a-z]{3,35}");//criar a regra
		Matcher m = p.matcher(u.getLogin().trim());//aplicação da regra
		return m.matches();
	}
	
	

	
}
