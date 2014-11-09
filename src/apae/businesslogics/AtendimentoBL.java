package apae.businesslogics;

import apae.data.TipoAtendimentoDAL;
import apae.data.AlunoDAL;
import apae.data.AtendimentoDAL;

import java.util.List;
import java.util.Date;

import apae.entities.Aluno;
import apae.entities.Atendimento;
import apae.entities.TipoAtendimento;

public class AtendimentoBL {

	private TipoAtendimentoDAL tipoAtendimentoDAL;

	private AlunoBL alunoBL;

	private AlunoDAL alunoDAL;

	private AtendimentoDAL atendimentoDAL;

	public List<Atendimento> listar(Date dataInicial, Date dataFinal) {
		return null;
	}

	public Atendimento get(int id) {
		return null;
	}

	public void inserir(Atendimento atendimento) {

	}

	public void atualizar(Atendimento atendimento) {

	}

	public boolean validar(Atendimento atendimento) {
		return false;
	}

	public List<TipoAtendimento> getTiposAtendimento() {
		return null;
	}

	public List<Aluno> getAlunos(Aluno filtro) {
		return null;
	}

}
