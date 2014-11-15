package apae.mbeans;

import apae.entities.TipoAtendimento;
import apae.businesslogics.TipoAtendimentoBL;

import java.util.List;

public class TipoAtendimentoMBean {

	private TipoAtendimento tipoAtendimento;

	private TipoAtendimentoBL tipoAtendimentoBL;

	public List<TipoAtendimento> getLista() {
		
		
		return tipoAtendimentoBL.listar();
	}

	public String salvar() {
		 if(tipoAtendimentoBL.validar(tipoAtendimento)){
			 if(tipoAtendimento.getIdTipoAtendimento() == 0);{
				 tipoAtendimentoBL.inserir(tipoAtendimento);
				 
			 }else{
				 
				 tipoAtendimentoBL.atualizar(tipoAtendimento);
			 }
			 
		 		 return "Nome XHTML listagem" ;
		 }
	
	}

	public String editar(int id) {
		return null;
	}

	public String desativar(int id) {
		return null;
	}

}
