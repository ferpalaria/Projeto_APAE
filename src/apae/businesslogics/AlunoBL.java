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
	//keivin
	private HipoteseDiagnosticoDAL hipoteseDiagnosticoDAL;

	private ProjetoDAL projetoDAL;

	private SalaDAL salaDAL;

	private AlunoDAL alunoDAL;

	public List<Aluno> listar(Aluno filtro) {
		return null;
	}

	public Aluno get(int id) {
		return null;
	}

	public void inserir(Aluno aluno) {

	}

	public void atualizar(Aluno aluno) {

	}

	public boolean validar(Aluno aluno) {
		return false;
	}

	public List<Projeto> getProjetos() {
		return null;
	}

	public List<Sala> getSalas() {
		return null;
	}

	public List<HipoteseDiagnostico> getHipotesesDiagnostico() {
		return null;
	}

}
