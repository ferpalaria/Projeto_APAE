package apae.mbeans;

import apae.businesslogics.AtendimentoBL;

import java.util.Date;

import apae.entities.Aluno;
import apae.entities.Atendimento;
import apae.entities.TipoAtendimento;

import java.util.List;

public class AtendimentoMBean {

	private Atendimento atendimento;

	private Date filtroDataInicial;

	private Date filtroDataFinal;

	private Aluno filtroAluno;

	private AtendimentoBL atendimentoBL;

	public List<Atendimento> getLista() {
		return null;
	}

	public String salvar() {
		return null;
	}

	public String editar(int id) {
		return null;
	}

	public String visualizar(int id) {
		return null;
	}

	public List<TipoAtendimento> getTiposAtendimento() {
		return null;
	}

	public List<Aluno> getAlunos() {
		return null;
	}

}
