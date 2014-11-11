package apae.mbeans;

import apae.entities.Aluno;
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

	public List getLista() {
		return null;
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
			//FacesContext
			
			return "";
		}
	}

	public String editar(int id) {
		return null;
	}

	public List getProjetos() {
		return null;
	}

	public List getSalas() {
		return null;
	}

	public List getHipotesesDiagnostico() {
		return null;
	}

}
