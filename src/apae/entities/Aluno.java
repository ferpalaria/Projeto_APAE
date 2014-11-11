package apae.entities;

import java.util.Date;
import java.util.Collection;

public class Aluno extends Pessoa {

	private int numCertidaoNascimento;

	private int numCartaoCidadao;

	private Date dataMatricula;

	private String padrinho;

	private String telefonePadrinho;

	private String emailPadrinho;

	private boolean bolsaFamilia;

	private boolean segunda;

	private boolean terca;

	private boolean quarta;

	private boolean quinta;

	private boolean sexta;

	private boolean frequenciaRegular;

	private boolean ativo;

	private Collection<Projeto> projeto;

	private Sala sala;

	private HipoteseDiagnostico hipoteseDiagnostico;

	private Collection<Atendimento> atendimento;

	private Collection<Relatorio> relatorio;

	public int getNumCertidaoNascimento() {
		return numCertidaoNascimento;
	}

	public void setNumCertidaoNascimento(int numCertidaoNascimento) {
		this.numCertidaoNascimento = numCertidaoNascimento;
	}

	public int getNumCartaoCidadao() {
		return numCartaoCidadao;
	}

	public void setNumCartaoCidadao(int numCartaoCidadao) {
		this.numCartaoCidadao = numCartaoCidadao;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getPadrinho() {
		return padrinho;
	}

	public void setPadrinho(String padrinho) {
		this.padrinho = padrinho;
	}

	public String getTelefonePadrinho() {
		return telefonePadrinho;
	}

	public void setTelefonePadrinho(String telefonePadrinho) {
		this.telefonePadrinho = telefonePadrinho;
	}

	public String getEmailPadrinho() {
		return emailPadrinho;
	}

	public void setEmailPadrinho(String emailPadrinho) {
		this.emailPadrinho = emailPadrinho;
	}

	public boolean isBolsaFamilia() {
		return bolsaFamilia;
	}

	public void setBolsaFamilia(boolean bolsaFamilia) {
		this.bolsaFamilia = bolsaFamilia;
	}

	public boolean isSegunda() {
		return segunda;
	}

	public void setSegunda(boolean segunda) {
		this.segunda = segunda;
	}

	public boolean isTerca() {
		return terca;
	}

	public void setTerca(boolean terca) {
		this.terca = terca;
	}

	public boolean isQuarta() {
		return quarta;
	}

	public void setQuarta(boolean quarta) {
		this.quarta = quarta;
	}

	public boolean isQuinta() {
		return quinta;
	}

	public void setQuinta(boolean quinta) {
		this.quinta = quinta;
	}

	public boolean isSexta() {
		return sexta;
	}

	public void setSexta(boolean sexta) {
		this.sexta = sexta;
	}

	public boolean isFrequenciaRegular() {
		return frequenciaRegular;
	}

	public void setFrequenciaRegular(boolean frequenciaRegular) {
		this.frequenciaRegular = frequenciaRegular;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Collection<Projeto> getProjeto() {
		return projeto;
	}

	public void setProjeto(Collection<Projeto> projeto) {
		this.projeto = projeto;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public HipoteseDiagnostico getHipoteseDiagnostico() {
		return hipoteseDiagnostico;
	}

	public void setHipoteseDiagnostico(HipoteseDiagnostico hipoteseDiagnostico) {
		this.hipoteseDiagnostico = hipoteseDiagnostico;
	}

	public Collection<Atendimento> getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(Collection<Atendimento> atendimento) {
		this.atendimento = atendimento;
	}

	public Collection<Relatorio> getRelatorio() {
		return relatorio;
	}

	public void setRelatorio(Collection<Relatorio> relatorio) {
		this.relatorio = relatorio;
	}
}
