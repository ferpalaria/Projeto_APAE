package apae.entities;

public class HipoteseDiagnostico {

	private int idHipoteseDiagnostico;

	private String descricao;

	private boolean ativo;

	public int getIdHipoteseDiagnostico() {
		return idHipoteseDiagnostico;
	}

	public void setIdHipoteseDiagnostico(int idHipoteseDiagnostico) {
		this.idHipoteseDiagnostico = idHipoteseDiagnostico;
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
