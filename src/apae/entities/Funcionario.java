package apae.entities;

import java.util.Collection;

public class Funcionario extends Pessoa {

	private boolean acessoSistema;
	private String usuario;
	private String senha;
	private boolean ativo;
	private Cargo cargo;
	private Collection<Sala> sala;
	private Collection<Atendimento> atendimento;

	public boolean isAcessoSistema() {
		return acessoSistema;
	}

	public void setAcessoSistema(boolean acessoSistema) {
		this.acessoSistema = acessoSistema;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Collection<Sala> getSala() {
		return sala;
	}

	public void setSala(Collection<Sala> sala) {
		this.sala = sala;
	}

	public Collection<Atendimento> getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Collection<Atendimento> atendimento) {
		this.atendimento = atendimento;
	}

}
