package apae.entities;

import java.util.Collection;

public class Sala {

	private int idSala;

	private int numero;

	private int descricao;

	private boolean ativo;

	private Collection<Aluno> aluno;

	private Collection<Funcionario> funcionario;

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDescricao() {
		return descricao;
	}

	public void setDescricao(int descricao) {
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

	public Collection<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Collection<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

}
