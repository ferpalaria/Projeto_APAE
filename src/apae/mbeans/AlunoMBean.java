package apae.mbeans;

import apae.entities.Aluno;
import apae.entities.HipoteseDiagnostico;
import apae.entities.Projeto;
import apae.entities.Sala;
import apae.businesslogics.AlunoBL;
import java.util.List;

import javax.faces.context.FacesContext;

public class AlunoMBean {

	private Aluno aluno;
	private Aluno filtro;
	private AlunoBL alunoBL;
	
	public AlunoMBean(){
		
		aluno = new Aluno();
		filtro = new Aluno();
		alunoBL = new AlunoBL();
	}

	public List<Aluno> getLista() {
		
		return alunoBL.listar(filtro);
	}

	public String salvar() {
		
		if(alunoBL.validar(aluno)){
			
			if(aluno.getIdPessoa() == 0){
				
				alunoBL.inserir(aluno);
			
			}else{
				
				alunoBL.atualizar(aluno);
			}	
			
			return "nome xhtml listagem";
		}else{
			
			FacesContext facesContext = FacesContext.getCurrentInstance();
			alunoBL.getErroModel().toFacesContext(facesContext);
			
			return "";
		}
	}

	public String editar(int id) {
		aluno = alunoBL.get(id);
				
		return "Pagina de cadastro";
	}

	public List<Projeto> getProjetos() {
		return alunoBL.getProjetos();
	}

	public List<Sala> getSalas() {
		return alunoBL.getSalas();
	}

	public List<HipoteseDiagnostico> getHipotesesDiagnostico() {
		return alunoBL.getHipotesesDiagnostico();
	}

}
