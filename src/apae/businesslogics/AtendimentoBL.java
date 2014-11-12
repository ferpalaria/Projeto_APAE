package apae.businesslogics;

import apae.data.TipoAtendimentoDAL;
import apae.data.AlunoDAL;
import apae.data.AtendimentoDAL;

import java.util.List;
import java.util.Date;

import utils.ErroModel;
import apae.entities.Aluno;
import apae.entities.Atendimento;
import apae.entities.TipoAtendimento;

public class AtendimentoBL {

	private TipoAtendimentoDAL tipoAtendimentoDAL;
	
	private AlunoBL alunoBL;
	private AlunoDAL alunoDAL;
	private AtendimentoDAL atendimentoDAL;
	
	private ErroModel erroModel;
	
	public AtendimentoBL(){
		
		tipoAtendimentoDAL = new TipoAtendimentoDAL();
		alunoDAL = new AlunoDAL();
		atendimentoDAL = new AtendimentoDAL();
		erroModel = new ErroModel();
	}
	
	public ErroModel getErroModel(){
		return erroModel;
	}

	public List<Atendimento> listar(Date dataInicial, Date dataFinal) {
		return null;
	}

	public Atendimento get(int id) {
		
		return atendimentoDAL.get(id);
	}

	public void inserir(Atendimento atendimento) {

	}

	public void atualizar(Atendimento atendimento) {

	}

	public boolean validar(Atendimento atendimento) {
		
		if(atendimento.getTipoAtendimento() == null ||
				atendimento.getTipoAtendimento().getIdTipoAtendimento() == 0){
			
			erroModel.add("tipoAtendimento", "Esse campo deve ser obrigatorio");
		}
		
		if(atendimento.getDataAtendimento() == null){
			
			erroModel.add("dataAtendimento", "O data atendimento é obrigatório");
		}
		
		if(atendimento.getAluno() == null || 
				atendimento.getAluno().getIdPessoa() == 0){
			
			erroModel.add("aluno", "O campo aluno deve ser obrigatório");	
		}
		
		if(atendimento.getDescricao() == null ||
				atendimento.getDescricao().trim().length() == 0){
			
			erroModel.add("descricao", "O campo descrição deve ser obrigatório");	
		
		}else if(atendimento.getDescricao().length() > 3000){
			
			erroModel.add("descricao", "O campo descrição deve conter "
					+ "um número abaixo de 3000 caracteres");			
			
		}
		
		return erroModel.isValido();
	}

	public List<TipoAtendimento> getTiposAtendimento() {
		
		return tipoAtendimentoDAL.listar();
	}

	public List<Aluno> getAlunos(Aluno filtro) {
		
		return alunoDAL.listar(filtro);
	}

}
