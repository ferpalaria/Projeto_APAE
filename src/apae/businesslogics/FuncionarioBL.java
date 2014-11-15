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
	
	public FuncionarioBL(){
		
		cargoDAL = new CargoDAL();
		funcionarioDAL = new FuncionarioDAL();
		erroModel = new ErroModel();
	}

	public List<Funcionario> listar(Funcionario filtro) {
		return null;
	}

	public Funcionario get(int id) {
		
		return funcionarioDAL.get(id);
	}

	public void inserir(Funcionario funcionario) {

	}

	public void atualizar(Funcionario funcionario) {

	}
	// nome | telefone | cargo serão obrigatórios
	public boolean validar(Funcionario funcionario) {
		
		if(funcionario.getNome() == null ||
				funcionario.getNome().trim().length() == 0){
			
			erroModel.add("nome","O campo nome deve ser obrigatório");
		}else if(funcionario.getNome().length() > 40){
			
			erroModel.add("nome", "O campo nome deve conter entre um número"
					+ "abaixo do que 40 caracteres1");			
		}
		
		if(funcionario.getTelefone() == null){
			
		}
		
		return erroModel.isValido();
	}

	public List<Cargo> getCargos() {
		return null;
	}

}
