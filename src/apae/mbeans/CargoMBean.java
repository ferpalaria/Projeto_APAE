package apae.mbeans;

import apae.entities.Cargo;
import apae.businesslogics.CargoBL;

import java.util.List;

public class CargoMBean {

	private Cargo cargo;

	private CargoBL cargoBL;

	public List<Cargo> getLista() {
		return null;
	}

	public String salvar() {
		//TODO: aqui deve-se verificar o id, se for 0 então indica que tem que inserir, 
		//      caso contrario, tem atualizar
		return null;
	}

	public String editar(int id) {
		/*
		 * TODO: aqui deve se carregar o cargo pelo id e redirecionar para pagina de edição
		 *       ex:
		 * cargo = cargoBL.get(id);
		 * return "xhtml de cadastro";
		 * */
		return null;
	}

	public String desativar(int id) {
		return null;
	}

}
