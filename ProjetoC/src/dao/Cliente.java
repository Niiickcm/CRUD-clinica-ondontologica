package dao;

	
	import java.sql.*;
	import java.util.ArrayList;
	import java.util.List;

	import javax.swing.JTable;
	import javax.swing.JTextField;

	import connectionfactory.Conexao;
	import bean.Cadastro_Cliente;

	public class Cliente extends Cadastro_Cliente {

			private Connection conn;
			private PreparedStatement ps;
			private ResultSet rs; // é a minha tabela
			private Cadastro_Cliente Cadastro_Cliente;
			

			public Cliente() throws Exception {
				// chama a classe ConnectionFactory e estabele uma conexão
				try {
					this.conn = Conexao.getConnection();
				} catch (Exception e) {
					throw new Exception("erro: \n" + e.getMessage());
				}
			}

			// método de salvar

			public void salvar(Cadastro_Cliente Cadastro_Cliente) throws Exception {
				if (Cadastro_Cliente == null)
					throw new Exception("O valor passado nao pode ser nulo");
				try {
					String SQL = "INSERT INTO cadastro_paciente (nome,rg,cpf,data_nasc,tell,rua,bairro,cidade,estado,email)  values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
					conn = this.conn;
					ps = conn.prepareStatement(SQL);
					ps.setString(1, Cadastro_Cliente.getNome());
					ps.setString(2, Cadastro_Cliente.getRg());
					ps.setString(3, Cadastro_Cliente.getCpf());
					ps.setString(4, Cadastro_Cliente.getData_nasc());
					ps.setString(5, Cadastro_Cliente.getTell());
					ps.setString(6, Cadastro_Cliente.getRua());
					ps.setString(7, Cadastro_Cliente.getBairro());
					ps.setString(8, Cadastro_Cliente.getCidade());
					ps.setString(9, Cadastro_Cliente.getEstado());
					ps.setString(10, Cadastro_Cliente.getEmail());
					ps.executeUpdate();
					
				} catch (SQLException sqle) {
					throw new Exception("Erro ao inserir dados " + sqle);
				} finally {
					Conexao.closeConnection(conn, ps);
				}
			}
			
			
			
			
			
			public void atualizar(Cadastro_Cliente Cadastro_Cliente) throws Exception {
				if (Cadastro_Cliente == null)
					throw new Exception("O valor passado nao pode ser nulo");
				try {
					String SQL = "UPDATE cadastro_paciente set rg=?,cpf=?,data_nasc=?,tell=?,rua=?,bairro=?,cidade=?,estado=?,email=? WHERE nome=?";
							
					conn = this.conn;
					ps = conn.prepareStatement(SQL);
					ps.setString(1, Cadastro_Cliente.getNome());
					ps.setString(2, Cadastro_Cliente.getRg());
					ps.setString(3, Cadastro_Cliente.getCpf());
					ps.setString(4, Cadastro_Cliente.getData_nasc());
					ps.setString(5, Cadastro_Cliente.getTell());
					ps.setString(6, Cadastro_Cliente.getRua());
					ps.setString(7, Cadastro_Cliente.getBairro());
					ps.setString(8, Cadastro_Cliente.getCidade());
					ps.setString(9, Cadastro_Cliente.getEstado());
					ps.setString(10, Cadastro_Cliente.getEmail());
					
					ps.executeUpdate();
				} catch (SQLException sqle) {
					throw new Exception("Erro ao alterar dados " + sqle);
				} finally {
					Conexao.closeConnection(conn, ps);
				}
			}
			

				
				
	}


