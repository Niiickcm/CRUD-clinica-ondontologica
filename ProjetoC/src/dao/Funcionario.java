package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.JTextField;

import connectionfactory.Conexao;
import bean.Cadastro_Cliente;
import bean.Cadastro_Funcionario;

public class Funcionario extends Cadastro_Funcionario {

	        private Connection conn;
			private PreparedStatement ps;
			private ResultSet rs; // é a minha tabela
			private Cadastro_Funcionario cadastro_funcionario;
			

			public Funcionario() throws Exception {
				// chama a classe ConnectionFactory e estabele uma conexão
				try {
					this.conn = Conexao.getConnection();
				} catch (Exception e) {
					throw new Exception("erro: \n" + e.getMessage());
				}
			}

			// método de salvar

			public void salvar(Cadastro_Funcionario cadastro_funcionario) throws Exception {
				if (cadastro_funcionario == null)
					throw new Exception("O valor passado nao pode ser nulo");
				try {
					String SQL = "INSERT INTO cadastro_paciente (registro,nome,tell,email,rg,cpf,data_nasc,rua,bairro,cidade,estado,comissao)  values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
					conn = this.conn;
					ps = conn.prepareStatement(SQL);
					ps.setString(1, cadastro_funcionario.getRegistro());
					ps.setString(2, cadastro_funcionario.getNome());
					ps.setString(3, cadastro_funcionario.getTell());
					ps.setString(4, cadastro_funcionario.getEmail());
					ps.setString(5, cadastro_funcionario.getRg());
					ps.setString(6, cadastro_funcionario.getCpf());
					ps.setString(7, cadastro_funcionario.getData_nasc());
					ps.setString(8, cadastro_funcionario.getRua());
					ps.setString(9, cadastro_funcionario.getBairro());
					ps.setString(10,cadastro_funcionario.getCidade());
					ps.setString(10,cadastro_funcionario.getEstado());
					ps.setString(10,cadastro_funcionario.getComissao());
					ps.executeUpdate();
					
				} catch (SQLException sqle) {
					throw new Exception("Erro ao inserir dados " + sqle);
				} finally {
					Conexao.closeConnection(conn, ps);
				}
			}
			
			
			
			
			
			public void atualizar(Cadastro_Funcionario c_funcionario) throws Exception {
				if (c_funcionario == null)
					throw new Exception("O valor passado nao pode ser nulo");
				try {
					String SQL = "UPDATE cadastro_paciente set rg=?,cpf=?,data_nasc=?,tell=?,rua=?,bairro=?,cidade=?,estado=?,email=? WHERE nome=?";
							
					conn = this.conn;
					ps = conn.prepareStatement(SQL);
					ps.setString(1, c_funcionario.getNome());
					ps.setString(2, c_funcionario.getRg());
					ps.setString(3, c_funcionario.getCpf());
					ps.setString(4, c_funcionario.getData_nasc());
					ps.setString(5, c_funcionario.getTell());
					ps.setString(6, c_funcionario.getRua());
					ps.setString(7, c_funcionario.getBairro());
					ps.setString(8, c_funcionario.getCidade());
					ps.setString(9, c_funcionario.getEstado());
					ps.setString(10, c_funcionario.getEmail());
					
					ps.executeUpdate();
				} catch (SQLException sqle) {
					throw new Exception("Erro ao alterar dados " + sqle);
				} finally {
					Conexao.closeConnection(conn, ps);
				}
			}

			
			

			public void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}

		
			

				
				
	}
