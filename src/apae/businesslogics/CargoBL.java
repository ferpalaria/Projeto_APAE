package apae.businesslogics;

import apae.data.CargoDAL;

import java.util.List;

import utils.ErroModel;
import apae.entities.Cargo;

public class CargoBL {

	private CargoDAL cargoDAL;
	private ErroModel erroModel;
	
	public CargoBL(){
		
		cargoDAL = new CargoDAL();
		erroModel = new ErroModel();
	}
	
	public ErroModel getErroModel(){
	
		return erroModel;
	}
	
	public List<Cargo> listar(String nome) {
		return null;
	}

	public Cargo get(int id) {
		
		return cargoDAL.get(id);
	}

	public void inserir(Cargo cargo) {

	}

	public void atualizar(Cargo cargo) {

	}

	public void desativar(int id) {

	}

	public boolean validar(Cargo cargo) {
		
		if(cargo.getNome() == null ||
				cargo.getNome().trim().length() == 0){
			
		}
				return erroModel.isValido();
	}

}
