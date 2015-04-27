package controle;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;



@ApplicationScoped
@ManagedBean
public class MensagenMB {
	
	private String inputMensage;
	private String message;
	
	public String send(){
		this.message = inputMensage;
		this.inputMensage = new String();
		return "index";
	}
	
	public String getInputMensage() {
		return inputMensage;
	}
	public void setInputMensage(String inputMensage) {
		this.inputMensage = inputMensage;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
