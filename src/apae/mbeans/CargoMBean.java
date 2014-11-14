package apae.mbeans;

import apae.entities.Cargo;
import apae.businesslogics.CargoBL;

import java.util.List;

import javax.faces.context.FacesContext;

public class CargoMBean {

	private Cargo cargo;

	private CargoBL cargoBL;
	
	public CargoMBean(){
		cargo = new Cargo();
		cargoBL = new CargoBL();
	}
	
	public List<Cargo> getLista() {
		return cargoBL.listar();
	}

	public String salvar() {
		//TODO: aqui deve-se verificar o id, se for 0 então indica que tem que inserir, 
		//      caso contrario, tem atualizar
		
		if(cargoBL.validar(cargo)){
			if(cargo.getIdCargo() == 0){
				cargoBL.inserir(cargo);
			}
			else{
				cargoBL.atualizar(cargo);
			}
			return "pagina de listar cargos";
		}
		else{
			FacesContext facesContext = FacesContext.getCurrentInstance();
			cargoBL.getErroModel().toFacesContext(facesContext);
			
			return "";
		}
	}

	public String editar(int id) {
		/*
		 * TODO: aqui deve se carregar o cargo pelo id e redirecionar para pagina de edição
		 *       ex:
		 * cargo = cargoBL.get(id);
		 * return "xhtml de cadastro";
		 * */
		
		cargo = cargoBL.get(id);
		return "";
	}

	public String desativar(int id) {
		return "";
	}

}
