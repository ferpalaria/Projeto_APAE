package apae.data;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
				+ "segunda, terca, quarta, quinta, sexta, frequenciaRegular, ativo FROM Aluno WHERE idPessoa = " + id;
		
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
			throw new Exception("Aluno não encontrado!" + id);
		}
		
		String sqlGetPessoa = "SELECT idPessoa, nome, rg, cpf, dataNascimento, sexo, dataCadastro "
				+ "FROM Pessoa WHERE idPessoa = " + id;
		
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

	public void inserir(Aluno aluno) throws Exception {
		
		String sqlInsertAluno = "INSERT INTO Aluno (idPessoa, numCertidaoNascimento, numCartaoCidadao, "
				+ "dataMatricula, padrinho, telefonePadrinho, emailPadrinho, bolsaFamilia, "
				+ "segunda, terca, quarta, quinta, sexta, frequenciaRegular, ativo)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		
		try {
			Connection con = ConexaoFactory.getConexao();
			PreparedStatement ps = con.prepareStatement(sqlInsertAluno);
			ps.setInt(1, aluno.getIdPessoa());
			ps.setInt(2, aluno.getNumCertidaoNascimento());
			ps.setInt(3, aluno.getNumCartaoCidadao());
			ps.setDate(4, new Date( aluno.getDataMatricula().getTime() ));
			ps.setString(5, aluno.getPadrinho());
			ps.setString(6, aluno.getTelefonePadrinho());
			ps.setString(7, aluno.getEmailPadrinho());
			ps.setBoolean(8, aluno.isBolsaFamilia());
			ps.setBoolean(9, aluno.isSegunda());
			ps.setBoolean(10, aluno.isTerca());
			ps.setBoolean(11, aluno.isQuarta());
			ps.setBoolean(12, aluno.isQuinta());
			ps.setBoolean(13, aluno.isSexta());
			ps.setBoolean(14, aluno.isFrequenciaRegular());
			ps.setBoolean(15, aluno.isAtivo());
			
			
			int ret = ps.executeUpdate();
			if (ret != 1) {
				throw new Exception("Valor não foi inserido por erro de banco."); 
			}
			ps.close();
			
		} catch (Exception e) {
			System.err.println("Erro ao incluir os dados Aluno" + e);
			e.printStackTrace();
			throw e;
		}
		
		String sqlInsertPessoa = "INSERT INTO Pessoa (idPessoa, nome, rg, cpf, dataNascimento, sexo, dataCadastro)"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		try{
			Connection con = ConexaoFactory.getConexao();
			PreparedStatement ps = con.prepareStatement(sqlInsertPessoa);
			
			ps.setInt(1, aluno.getIdPessoa());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getRg());
			ps.setString(4, aluno.getCpf());
			ps.setDate(5, new Date( aluno.getDataNascimento().getTime() ));
			ps.setString(6, aluno.getSexo());
			ps.setDate(7, new Date(aluno.getDataCadastro().getTime()) );
			
			int ret = ps.executeUpdate();
			if (ret != 1) {
				throw new Exception("Valor não foi inserido por erro de banco."); 
			}
			ps.close();
			
		} catch (Exception e) {
			System.err.println("Erro ao incluir os dados Aluno" + e);
			e.printStackTrace();
			throw e;
		}
		
		
	}

	public void atualizar(Aluno aluno) throws Exception {
		String sqlUpdateAluno = "UPDATE Aluno SET idPessoa = ?, numCertidaoNascimento = ?, numCartaoCidadao = ?, "
				+ "dataMatricula = ?, padrinho = ?, telefonePadrinho = ?, emailPadrinho = ?, bolsaFamilia = ?, "
				+ "segunda = ?, terca = ?, quarta = ?, quinta = ?, sexta = ?, frequenciaRegular = ?, ativo = ? "
				+ "WHERE idPessoa = " + aluno.getIdPessoa();
		
		
		try {
			Connection con = ConexaoFactory.getConexao();
			PreparedStatement ps = con.prepareStatement(sqlUpdateAluno);
			ps.setInt(1, aluno.getIdPessoa());
			ps.setInt(2, aluno.getNumCertidaoNascimento());
			ps.setInt(3, aluno.getNumCartaoCidadao());
			ps.setDate(4, new Date( aluno.getDataMatricula().getTime() ));
			ps.setString(5, aluno.getPadrinho());
			ps.setString(6, aluno.getTelefonePadrinho());
			ps.setString(7, aluno.getEmailPadrinho());
			ps.setBoolean(8, aluno.isBolsaFamilia());
			ps.setBoolean(9, aluno.isSegunda());
			ps.setBoolean(10, aluno.isTerca());
			ps.setBoolean(11, aluno.isQuarta());
			ps.setBoolean(12, aluno.isQuinta());
			ps.setBoolean(13, aluno.isSexta());
			ps.setBoolean(14, aluno.isFrequenciaRegular());
			ps.setBoolean(15, aluno.isAtivo());
			
			
			int ret = ps.executeUpdate();
			if (ret == 0) {
				System.out.println(ret);
				throw new Exception("Valor não foi atualizado por erro de banco."); 
			}
			ps.close();
			
		} catch (Exception e) {
			System.err.println("Erro ao atualizar os dados Aluno" + e);
			e.printStackTrace();
			throw e;
		}
		
		String sqlUpdatePessoa = "UPDATE Pessoa SET idPessoa = ?, nome = ?, rg = ?, cpf = ?, dataNascimento = ?, sexo = ?, dataCadastro = ? "
				+ "WHERE idPessoa = " + aluno.getIdPessoa();
		
		try{
			Connection con = ConexaoFactory.getConexao();
			PreparedStatement ps = con.prepareStatement(sqlUpdatePessoa);
			
			ps.setInt(1, aluno.getIdPessoa());
			ps.setString(2, aluno.getNome());
			ps.setString(3, aluno.getRg());
			ps.setString(4, aluno.getCpf());
			ps.setDate(5, new Date(aluno.getDataNascimento().getTime()));
			ps.setString(6, aluno.getSexo());
			ps.setDate(7, new Date(aluno.getDataCadastro().getTime()) );
			
			int ret = ps.executeUpdate();
			if (ret == 0) {
				throw new Exception("Valor não foi atualizado por erro de banco."); 
			}
			ps.close();
			
		} catch (Exception e) {
			System.err.println("Erro ao atualizar os dados Aluno" + e);
			e.printStackTrace();
			throw e;
		}
	}

}
