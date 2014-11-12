package apae.mbeans;

import apae.businesslogics.AtendimentoBL;

import java.util.Date;

import apae.data.AtendimentoDAL;
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
	
	public AtendimentoMBean(){
		
		atendimento = new Atendimento();
		filtroDataInicial = new Date();
		filtroDataFinal = new Date();
		filtroAluno = new Aluno();
		atendimentoBL = new AtendimentoBL();
	}

	public List<Atendimento> getLista() {
		
		return atendimentoBL.listar(filtroDataFinal, filtroDataInicial);
	}

	public String salvar() {
		
		if(atendimentoBL.validar(atendimento)){
			
			if(atendimento.getIdAtendimento() == 0){
				
				// 
			}
			
		}
		return "xhtml file";
	}

	public String editar(int id) {
		
		atendimento = atendimentoBL.get(id);
		
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
