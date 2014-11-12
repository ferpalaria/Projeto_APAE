package apae.businesslogics;

import apae.data.TipoAtendimentoDAL;
import apae.data.AlunoDAL;
import apae.data.AtendimentoDAL;

import java.util.List;
import java.util.Date;

import utils.ErroModel;
import apae.entities.Aluno;
import apae.entities.Atendimento;
import apae.entities.TipoAtendimento;

public class AtendimentoBL {

	private TipoAtendimentoDAL tipoAtendimentoDAL;
	
	private AlunoBL alunoBL;
	
	private AlunoDAL alunoDAL;
	
	private AtendimentoDAL atendimentoDAL;
	
	private ErroModel erroModel;
	
	public AtendimentoBL(){
		
		tipoAtendimentoDAL = new TipoAtendimentoDAL();
		alunoBL = new AlunoBL();
		alunoDAL = new AlunoDAL();
		atendimentoDAL = new AtendimentoDAL();
		erroModel = new ErroModel();
	}
	
	public ErroModel getErroModel(){
		return erroModel;
	}

	public List<Atendimento> listar(Date dataInicial, Date dataFinal) {
		return null;
	}

	public Atendimento get(int id) {
		
		return atendimentoDAL.get(id);
	}

	public void inserir(Atendimento atendimento) {

	}

	public void atualizar(Atendimento atendimento) {

	}

	public boolean validar(Atendimento atendimento) {
		
		return false;
	}

	public List<TipoAtendimento> getTiposAtendimento() {
		
		return tipoAtendimentoDAL.listar();
	}

	public List<Aluno> getAlunos(Aluno filtro) {
		
		return alunoDAL.listar(filtro);
	}

}
