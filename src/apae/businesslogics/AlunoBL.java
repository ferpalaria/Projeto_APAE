package apae.businesslogics;

import apae.data.HipoteseDiagnosticoDAL;
import apae.data.ProjetoDAL;
import apae.data.SalaDAL;
import apae.data.AlunoDAL;

import java.util.List;

import utils.ErroModel;
import apae.entities.Aluno;
import apae.entities.HipoteseDiagnostico;
import apae.entities.Projeto;
import apae.entities.Sala;

public class AlunoBL {

	private HipoteseDiagnosticoDAL hipoteseDiagnosticoDAL;
	private ProjetoDAL projetoDAL;
	private SalaDAL salaDAL;
	private AlunoDAL alunoDAL;
	private ErroModel erroModel;
	
	public AlunoBL(){
		
		hipoteseDiagnosticoDAL = new HipoteseDiagnosticoDAL();
		projetoDAL = new ProjetoDAL();
		salaDAL = new SalaDAL();
		alunoDAL = new AlunoDAL();
		erroModel = new ErroModel();
	}
	
	public ErroModel getErroModel(){
		return erroModel;
	}

	public List<Aluno> listar(Aluno filtro) {
		return null;
	}

	public Aluno get(int id) {
		
		return alunoDAL.get(id); 
	}

	public void inserir(Aluno aluno) {

	}

	public void atualizar(Aluno aluno) {

	}

	public boolean validar(Aluno aluno) {
		
		if(aluno.getNome() == null || aluno.getNome().trim().isEmpty()){
	
			erroModel.add("nome", "O campo nome � obrigat�rio.");
		
		}else if(aluno.getNome().length() < 3 || aluno.getNome().length() > 80){
		
			erroModel.add("nome", "O campo nome dever conter de 3 � 80 caracteres.");
		}
		
		if(aluno.getCpf() == null || aluno.getCpf().trim().isEmpty()){
			erroModel.add("cpf", "O campo cpf � obrigat�rio.");
		}
		
		return erroModel.isValido();
	}

	public List<Projeto> getProjetos() {
		
		return projetoDAL.listar();
	}

	public List<Sala> getSalas() {
		
		return salaDAL.listar(); 
	}

	public List<HipoteseDiagnostico> getHipotesesDiagnostico() {
	
		return hipoteseDiagnosticoDAL.listar();
	}

}
