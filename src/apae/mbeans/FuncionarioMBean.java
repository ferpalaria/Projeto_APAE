package apae.mbeans;

import apae.data.CargoDAL;
import apae.entities.Cargo;
import apae.entities.Funcionario;
import apae.businesslogics.FuncionarioBL;

import java.util.List;

public class FuncionarioMBean {

	private Funcionario funcionario;
	private Funcionario filtro;
	private FuncionarioBL funcionarioBL;

	
	public List<Funcionario> getLista() {
		
		return funcionarioBL.listar(filtro);
	}

	public String salvar() {
		
	if(funcionarioBL.validar(funcionario)){
		if(funcionario.getIdPessoa() == 0){
			
			funcionarioBL.inserir(funcionario);
		
		}else{
			
			funcionarioBL.atualizar(funcionario);
		}	
		return "nome xhtml listagem";
	}
		
		return null;
	}

	public String editar(int id) {
		funcionario = funcionarioBL.get(id);
		return null;
	}

	public List<Cargo> getCargos() {
		return null;
	}

}
