package apae.entities;

public class TipoAtendimento {

	private int idTipoAtendimento;

	private String descricao;

	private boolean ativo;

	public int getIdTipoAtendimento() {
		return idTipoAtendimento;
	}

	public void setIdTipoAtendimento(int idTipoAtendimento) {
		this.idTipoAtendimento = idTipoAtendimento;
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

}
