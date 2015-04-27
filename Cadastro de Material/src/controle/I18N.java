package controle;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

@SessionScoped
@ManagedBean
public class I18N {

	private String locale;
	
	public String Lang(String lang){
		setLocale(lang);
		UIViewRoot root = FacesContext.getCurrentInstance().getViewRoot();
		root.setLocale(new Locale(lang));
		return root.getViewId();
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}
	
}
