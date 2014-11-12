package apae.businesslogics;

import apae.data.HipoteseDiagnosticoDAL;
import apae.data.ProjetoDAL;
import apae.data.SalaDAL;
import apae.data.AlunoDAL;

import java.util.List;

import apae.entities.Aluno;
import apae.entities.HipoteseDiagnostico;
import apae.entities.Projeto;
import apae.entities.Sala;

public class AlunoBL {

	private HipoteseDiagnosticoDAL hipoteseDiagnosticoDAL;
	private ProjetoDAL projetoDAL;
	private SalaDAL salaDAL;
	private AlunoDAL alunoDAL;
	
	public AlunoBL(){
		
		hipoteseDiagnosticoDAL = new HipoteseDiagnosticoDAL();
		projetoDAL = new ProjetoDAL();
		salaDAL = new SalaDAL();
		alunoDAL = new AlunoDAL();
		
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
		return false;
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
