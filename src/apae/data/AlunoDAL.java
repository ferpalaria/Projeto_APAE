package apae.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import apae.entities.Aluno;

public class AlunoDAL {

	private ConexaoFactory conexaoFactory;

	public List<Aluno> listar(Aluno filtro) {
		
		List<Aluno> alunoLista = new ArrayList<Aluno>();
		
		String sqlGetAluno = "SELECT idPessoa FROM Aluno";
		try{
			Connection con = ConexaoFactory.getConexao();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sqlGetAluno);
			
			while(rs.next()){
				int id = rs.getInt("idPessoa");
				
				alunoLista.add( get(id) );
			}
		} catch (Exception e){
			System.err.println("Erro ao gerar a Lista de Alunos");
			e.printStackTrace();
		}
		return alunoLista;
	}

	public Aluno get(int id) throws Exception {
	
		
		Aluno aluno = new Aluno();
		
		String sqlGetAluno = "SELECT idPessoa, numCertidaoNascimento, numCartaoCidadao, "
				+ "dataMatricula, padrinho, telefonePadrinho, emailPadrinho, bolsaFamilia, "
				+ "segunda, terca, quarta, quinta, sexta, frequenciaRegular, ativo FROM Aluno WHERE idPessoa = " + Integer.toString(id);
		
		try{
			Connection con = ConexaoFactory.getConexao();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sqlGetAluno);
			while (rs.next()) {
				int aux = rs.getInt("idPessoa");
				
				if(aux == id){
					aluno.setIdPessoa(rs.getInt("idPessoa"));
					aluno.setNumCertidaoNascimento(rs.getInt("numCertidaoNascimento"));
					aluno.setNumCartaoCidadao(rs.getInt("numCartaoCidadao"));
					aluno.setDataMatricula(rs.getDate("dataMatricula"));
					aluno.setPadrinho(rs.getString("padrinho"));
					aluno.setTelefonePadrinho(rs.getString("telefonePadrinho"));
					aluno.setEmailPadrinho(rs.getString("emailPadrinho"));
					aluno.setBolsaFamilia(rs.getBoolean("bolsaFamilia"));
					aluno.setSegunda(rs.getBoolean("segunda"));
					aluno.setTerca(rs.getBoolean("terca"));
					aluno.setQuarta(rs.getBoolean("quarta"));
					aluno.setQuinta(rs.getBoolean("quinta"));
					aluno.setSexta(rs.getBoolean("sexta"));
					aluno.setFrequenciaRegular(rs.getBoolean("frequenciaRegular"));
					aluno.setAtivo(rs.getBoolean("ativo"));
					
					break;
				}
			}
			stmt.close();
			rs.close();
		} catch (Exception e) {
			System.err.println("Erro no Banco de Dados");
			e.printStackTrace();
		}
		
		if(aluno.getIdPessoa() == 0){
			throw new Exception("Aluno não encontrado!");
		}
		
		String sqlGetPessoa = "SELECT idPessoa, nome, rg, cpf, dataNascimento, sexo, dataCadastro "
				+ "FROM Pessoa WHERE idPessoa = " + Integer.toString(id);
		
		try{
			Connection con = ConexaoFactory.getConexao();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sqlGetPessoa);
			
			while (rs.next()){
				int aux = rs.getInt("idPessoa");
				
				if(aux == id){
					aluno.setNome(rs.getString("nome"));
					aluno.setRg(rs.getString("rg"));
					aluno.setCpf(rs.getString("cpf"));
					aluno.setDataNascimento(rs.getDate("dataNascimento"));
					aluno.setSexo(rs.getString("sexo"));
					aluno.setDataCadastro(rs.getDate("dataCadastro"));
				}
			}
		} catch (Exception e) {
			System.err.println("Erro no Banco de Dados");
			e.printStackTrace();
		}
		
		return aluno;
	}

	public void inserir(Aluno aluno) {

	}

	public void atualizar(Aluno aluno) {

	}

}
