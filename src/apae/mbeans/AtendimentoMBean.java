package apae.mbeans;

import apae.businesslogics.AtendimentoBL;

import java.util.Date;
import apae.entities.Aluno;
import apae.entities.Atendimento;
import apae.entities.TipoAtendimento;

import java.util.List;

import javax.faces.context.FacesContext;

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
				atendimentoBL.inserir(atendimento);
			}
			else{
				atendimentoBL.atualizar(atendimento);
			}
			
			return "Pagina de listar Atendimento";
		}
		else{
			FacesContext facesContexto = FacesContext.getCurrentInstance();
			atendimentoBL.getErroModel().toFacesContext(facesContexto);
			
			return "";
		}
	}

	public String editar(int id) {
		atendimento = atendimentoBL.get(id);
		return "Pagina de cadastro";
	}

	public String visualizar(int id) {
		atendimento  = atendimentoBL.get(id);
		return "Pagina XHTML";
	}

	public List<TipoAtendimento> getTiposAtendimento() {
		return atendimentoBL.getTiposAtendimento();
	}

	public List<Aluno> getAlunos() {
		return atendimentoBL.getAlunos(filtroAluno);
	}

}
