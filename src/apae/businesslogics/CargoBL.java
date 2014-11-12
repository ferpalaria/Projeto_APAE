package apae.businesslogics;

import apae.data.CargoDAL;

import java.util.List;

import utils.ErroModel;
import apae.entities.Cargo;

public class CargoBL {

	private CargoDAL cargoDAL;
	
	private ErroModel erroModel;
	
	public ErroModel getErroModel(){
		return erroModel;
	}
	
	public List<Cargo> listar() {
		return null;
	}

	public Cargo get(int id) {
		return null;
	}

	public void inserir(Cargo cargo) {

	}

	public void atualizar(Cargo cargo) {

	}

	public void desativar(int id) {

	}

	public boolean validar(Cargo cargo) {
		return false;
	}

}
