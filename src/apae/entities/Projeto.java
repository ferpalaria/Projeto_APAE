package apae.entities;

import java.util.Collection;

public class Projeto {

	private int idProjeto;

	private String descricao;

	private boolean ativo;

	private Collection<Aluno> aluno;

	public int getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Collection<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(Collection<Aluno> aluno) {
		this.aluno = aluno;
	}

}
