package apae.entities;

public class TipoRelatorio {

	private int idTipoRelatorio;

	private String nome;

	private boolean ativo;

	public int getIdTipoRelatorio() {
		return idTipoRelatorio;
	}

	public void setIdTipoRelatorio(int idTipoRelatorio) {
		this.idTipoRelatorio = idTipoRelatorio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
