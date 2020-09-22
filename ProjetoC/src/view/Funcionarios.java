package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import bean.Cadastro_Cliente;
import bean.Cadastro_Funcionario;
import dao.Cliente;
import dao.Funcionario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Funcionarios extends JInternalFrame {
	private JTextField txtregistro;
	private JTextField txtnome;
	private JTextField txttell;
	private JTextField txtemail;
	private JTextField txtrg;
	private JTextField txtcpf;
	private JTextField txtdata_nasc;
	private JTextField txtrua;
	private JTextField txtbairro;
	private JTextField txtcidade;
	private JTextField txtestado;
	private JTextField txtcomissao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionarios frame = new Funcionarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Funcionarios() {
		setClosable(true);
		setBounds(100, 100, 580, 492);
		getContentPane().setLayout(null);
		
		
		
		JTable table = new JTable();
    	table.setModel(new DefaultTableModel(
    		new Object[][]{},
    		//TITULOS DAS SUAS COLUNAS
    		new String []{"REGISTRO","NOME","TELL","EMAIL","RG","CPF","DATA_NASC","RUA","BAIRRO","CIDADE","ESTADO","COMISSÃO"})     
	
    		{
    			public boolean isCellEditable(int r, int c)
    			{
    				return false;
    			}
    		} );
    	
    	//ALINHAMENTO DO TEXTO	
    	DefaultTableCellRenderer center = new DefaultTableCellRenderer();
    	center.setHorizontalAlignment(SwingConstants.CENTER);
    	
    	//DEFINE O TAMANHO DA LARGURA DA CULUNA
    	table.getColumnModel().getColumn(0).setPreferredWidth(50);
    	//NÃO PERMITE REDIMENCIONAMENTO
    	table.getColumnModel().getColumn(0).setResizable(false);
    	//CENTRALIZA O TEXTO
    	table.getColumnModel().getColumn(0).setCellRenderer(center);
    	
    	table.getColumnModel().getColumn(1).setPreferredWidth(250);
    	table.getColumnModel().getColumn(1).setResizable(false);
    	table.getColumnModel().getColumn(1).setCellRenderer(center);
    	table.getColumnModel().getColumn(2).setPreferredWidth(70);
    	table.getColumnModel().getColumn(2).setResizable(false);
    	table.getColumnModel().getColumn(2).setCellRenderer(center);
    	table.getColumnModel().getColumn(3).setPreferredWidth(150);
    	table.getColumnModel().getColumn(3).setResizable(false);
    	table.getColumnModel().getColumn(3).setCellRenderer(center);
    	table.getColumnModel().getColumn(4).setPreferredWidth(50);
    	table.getColumnModel().getColumn(4).setResizable(false);
    	table.getColumnModel().getColumn(4).setCellRenderer(center);
    	
    	//DEFINE A FONTE
    	table.getTableHeader().setFont(new Font("Arial",Font.BOLD,12));
    	//NÃO PERMITE A REORDENAÇÃO DAS COLUNAS
    	table.getTableHeader().setReorderingAllowed(false);
    	table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
    	table.setSelectionMode(0);
    	
    	JScrollPane Scroll = new JScrollPane();
    	Scroll.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			
    			if(table.getSelectedRow() != -1) {
    				txtnome.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
    				txtrg.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
    				txtcpf.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
    				txtdata_nasc.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
    				txttell.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
    				txtrua.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
    				txtbairro.setText(table.getValueAt(table.getSelectedRow(), 6).toString());
    				txtcidade.setText(table.getValueAt(table.getSelectedRow(), 7).toString());
    				txtestado.setText(table.getValueAt(table.getSelectedRow(), 8).toString());
    				txtemail.setText(table.getValueAt(table.getSelectedRow(), 9).toString());
    			}
    			
    		}
    	});
    	Scroll.setViewportView(table);
    	Scroll.setBounds(10,7,544,127);
    	getContentPane().add(Scroll);
    	
    	
    	
		
		JLabel lblNome = new JLabel("Registro:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNome.setBounds(23, 145, 59, 14);
		getContentPane().add(lblNome);
		
		txtregistro = new JTextField();
		txtregistro.setBounds(79, 142, 124, 20);
		getContentPane().add(txtregistro);
		txtregistro.setColumns(10);
		
		txtnome = new JTextField();
		txtnome.setBounds(79, 167, 308, 20);
		getContentPane().add(txtnome);
		txtnome.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(23, 195, 48, 14);
		getContentPane().add(lblTelefone);
		
		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setBounds(33, 170, 59, 14);
		getContentPane().add(lblNome_1);
		
		txttell = new JTextField();
		txttell.setBounds(79, 192, 124, 20);
		getContentPane().add(txttell);
		txttell.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(34, 220, 48, 14);
		getContentPane().add(lblEmail);
		
		txtemail = new JTextField();
		txtemail.setBounds(79, 217, 308, 20);
		getContentPane().add(txtemail);
		txtemail.setColumns(10);
		
		JLabel lblRg = new JLabel("Rg:");
		lblRg.setBounds(44, 245, 38, 14);
		getContentPane().add(lblRg);
		
		txtrg = new JTextField();
		txtrg.setBounds(79, 242, 124, 20);
		getContentPane().add(txtrg);
		txtrg.setColumns(10);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(220, 245, 48, 14);
		getContentPane().add(lblCpf);
		
		txtcpf = new JTextField();
		txtcpf.setBounds(253, 242, 134, 20);
		getContentPane().add(txtcpf);
		txtcpf.setColumns(10);
		
		JLabel lblNascimento = new JLabel("Nascimento:");
		lblNascimento.setBounds(4, 270, 67, 14);
		getContentPane().add(lblNascimento);
		
		txtdata_nasc = new JTextField();
		txtdata_nasc.setBounds(79, 267, 124, 20);
		getContentPane().add(txtdata_nasc);
		txtdata_nasc.setColumns(10);
		
		JLabel lblRuanumero = new JLabel("Rua/Numero:");
		lblRuanumero.setBounds(4, 295, 80, 14);
		getContentPane().add(lblRuanumero);
		
		txtrua = new JTextField();
		txtrua.setBounds(79, 292, 308, 20);
		getContentPane().add(txtrua);
		txtrua.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(34, 320, 48, 14);
		getContentPane().add(lblBairro);
		
		txtbairro = new JTextField();
		txtbairro.setBounds(79, 317, 189, 20);
		getContentPane().add(txtbairro);
		txtbairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(23, 345, 48, 14);
		getContentPane().add(lblCidade);
		
		txtcidade = new JTextField();
		txtcidade.setBounds(79, 342, 189, 20);
		getContentPane().add(txtcidade);
		txtcidade.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(278, 345, 48, 14);
		getContentPane().add(lblEstado);
		
		txtestado = new JTextField();
		txtestado.setBounds(321, 342, 67, 20);
		getContentPane().add(txtestado);
		txtestado.setColumns(10);
		
		JLabel lblComisso = new JLabel("Comiss\u00E3o:");
		lblComisso.setBounds(23, 370, 59, 14);
		getContentPane().add(lblComisso);
		
		txtcomissao = new JTextField();
		txtcomissao.setBounds(79, 367, 96, 20);
		getContentPane().add(txtcomissao);
		txtcomissao.setColumns(10);
		
		JButton btnSalvar = new JButton("Novo");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtregistro.setText(null);
				txtnome.setText(null);
				txttell.setText(null);
				txtemail.setText(null);
				txtrg.setText(null);
				txtcpf.setText(null);
				txtdata_nasc.setText(null);
				txtrua.setText(null);
				txtbairro.setText(null);
				txtcidade.setText(null);
				txtestado.setText(null);
				txtcomissao.setText(null);
			}
		});
		btnSalvar.setBounds(44, 410, 89, 23);
		getContentPane().add(btnSalvar);
		
		JButton btnAlterar = new JButton("Salvar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Cadastro_Funcionario c_funcionario = new Cadastro_Funcionario();
				// populei o objeto aluno
				c_funcionario.setRegistro(txtregistro.getText());
				c_funcionario.setNome(txtnome.getText());
				c_funcionario.setTell(txttell.getText());
				c_funcionario.setEmail(txtemail.getText());
				c_funcionario.setRg(txtrg.getText());
				c_funcionario.setCpf(txtcpf.getText());
				c_funcionario.setData_nasc(txtdata_nasc.getText());
				c_funcionario.setRua(txtrua.getText());
				c_funcionario.setBairro(txtbairro.getText());
				c_funcionario.setCidade(txtcidade.getText());
				c_funcionario.setEstado(txtestado.getText());
				c_funcionario.setComissao(txtcomissao.getText());
				
				
				
				
				try {
					// chamar a classe Cliente
					Funcionario f = new Funcionario();
					f.salvar(c_funcionario);
					JOptionPane.showMessageDialog(null, "Salvo com sucesso");
					
					
					
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, a.getMessage());
				}

				// ====================
				
				
				
				
				
				DefaultTableModel Dtm = (DefaultTableModel) table.getModel();
		    	Object [] dados = {txtregistro.getText(),txttell.getText(),txtcpf.getText(),txtdata_nasc.getText(),txttell.getText(),txtemail.getText(),txtrg.getText(),txtcpf.getText(),txtdata_nasc.getText(),txtrua.getText(),txtbairro.getText(),txtcidade.getText(),txtestado.getText(),txtcomissao.getText()};
		    	Dtm.addRow(dados);
		    	
		    	
		    	
			}
		});
			

		btnAlterar.setBounds(179, 410, 89, 23);
		getContentPane().add(btnAlterar);
		
		JButton btnConsultar = new JButton("Alterar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Cadastro_Funcionario c_funcinario = new Cadastro_Funcionario();
				// populei o objeto aluno
				Cadastro_Funcionario c_funcionario = new Cadastro_Funcionario();
				// populei o objeto aluno
				c_funcionario.setRegistro(txtregistro.getText());
				c_funcionario.setNome(txtnome.getText());
				c_funcionario.setTell(txttell.getText());
				c_funcionario.setEmail(txtemail.getText());
				c_funcionario.setRg(txtrg.getText());
				c_funcionario.setCpf(txtcpf.getText());
				c_funcionario.setData_nasc(txtdata_nasc.getText());
				c_funcionario.setRua(txtrua.getText());
				c_funcionario.setBairro(txtbairro.getText());
				c_funcionario.setCidade(txtcidade.getText());
				c_funcionario.setEstado(txtestado.getText());
				c_funcionario.setComissao(txtcomissao.getText());
				
				
				
				
				try {
					// chamar a classe Cliente
					Funcionario f = new Funcionario();
					f.atualizar(c_funcionario);
					JOptionPane.showMessageDialog(null, "Alterado com sucesso");
					
					
					
				} catch (Exception a) {
					JOptionPane.showInternalMessageDialog(null, a.getMessage()); 
				}
				
				
				

				
				if(table.getSelectedRow() != -1 ) {
					
					table.setValueAt(txtnome.getText(), table.getSelectedRow(), 0);
					table.setValueAt(txtrg.getText(), table.getSelectedRow(), 1);
					table.setValueAt(txtcpf.getText(), table.getSelectedRow(), 2);
					table.setValueAt(txtdata_nasc.getText(), table.getSelectedRow(), 3);
					table.setValueAt(txttell.getText(), table.getSelectedRow(), 4);
					table.setValueAt(txtrua.getText(), table.getSelectedRow(), 5);
					table.setValueAt(txtbairro.getText(), table.getSelectedRow(), 6);
					table.setValueAt(txtcidade.getText(), table.getSelectedRow(), 7);
					table.setValueAt(txtestado.getText(), table.getSelectedRow(), 8);
					table.setValueAt(txtemail.getText(), table.getSelectedRow(), 9);
				}
			}
			
		});
			

		btnConsultar.setBounds(311, 410, 89, 23);
		getContentPane().add(btnConsultar);
		
		JButton btnConsultar_1 = new JButton("Consultar");
		btnConsultar_1.setBounds(439, 410, 89, 23);
		getContentPane().add(btnConsultar_1);
		
		
		
		
		

	}
}
