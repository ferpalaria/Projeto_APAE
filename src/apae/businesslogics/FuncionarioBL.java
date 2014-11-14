package apae.businesslogics;

import apae.data.CargoDAL;
import apae.data.FuncionarioDAL;

import java.util.List;

import utils.ErroModel;
import apae.entities.Cargo;
import apae.entities.Funcionario;

public class FuncionarioBL {

	
	private CargoDAL cargoDAL;
	private FuncionarioDAL funcionarioDAL;
	private ErroModel erroModel;
	

	public ErroModel getErroModel(){
		return erroModel;
	}

	public List<Funcionario> listar(Funcionario filtro) {
		return null;
	}

	public Funcionario get(int id) {
		return funcionarioDAL.get(id);
	}

	public void inserir(Funcionario funcionario) {
		//Inserir; 	
	}

	public void atualizar(Funcionario funcionario) {
		//Atualizar;
	}

	public boolean validar(Funcionario funcionario) {
		
		if(funcionario.getNome() == null || 
				funcionario.getNome().trim().length() == 0){
			erroModel.add("nome","Este campo deve ser obrigatório");
			
		}else if(funcionario.getNome().length() > 40){
			
			erroModel.add("nome", "O campo nome deve contêr um número menor "
					+ "do que 40 caracteres");
		}
		
		return erroModel.isValido();
			
	}

	public List<Cargo> getCargos() {
		return cargoDAL.listar();
	}

}
