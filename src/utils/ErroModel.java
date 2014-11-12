package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class ErroModel {
	
	private boolean isValido;
	
	private Map<String, String> erros;
	
	public ErroModel(){
		erros = new HashMap<String, String>();
		isValido = true;
	}
	
	public boolean isValido() {
		return isValido;
	}
	
	public void add(String key, String messagem){
		erros.put(key, messagem);
		isValido = false;
	}
	
	public String get(String key){
		return erros.get(key);
	}
	
	public List<String> toList(){
		return new ArrayList<String>(erros.values());
	}
	
	public void toFacesContext(FacesContext facesContext){
		for(Entry<String, String> a : erros.entrySet()){
			facesContext.addMessage(a.getKey(), new FacesMessage(a.getValue()));
		}
	}
	
}
