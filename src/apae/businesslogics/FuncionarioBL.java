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

	public boolean validar(Funcionario funcionario) {
		
		return erroModel.isValido();
	}

	public List<Cargo> getCargos() {
		return null;
	}

}
