package view;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;
import controle.*;


public class TelaEditaveis implements ActionListener, ListSelectionListener {		
	private JFrame janela;
	private JLabel titulo;
	private JButton cadastroAluno;
	private JButton refreshAluno;
	private JButton cadastroProf;
	private JButton refreshProf;
	private static ControleDados dados;
	private JList<String> listaAlunosCadastrados;
	private JList<String> listaProfsCadastrados;
	private ArrayList<String> listaNomes = new ArrayList<String>();

	public void mostrarDados(ControleDados d, int op){
		dados = d;

		switch (op) {
		case 1:// Mostrar dados de alunos cadastrados (JList)
			String[] nomesProdutos = new String[dados.getProdutos().size()];
			for (int i=0; i<dados.getProdutos().size();i++) {
				nomesProdutos[i]= dados.getProdutos().get(i).getNome();
			}
			
			listaAlunosCadastrados = new JList<String>(nomesProdutos);
			janela = new JFrame("Alunos");
			titulo = new JLabel("Alunos Cadastrados");
			cadastroAluno = new JButton("Cadastrar");
			refreshAluno = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaAlunosCadastrados.setBounds(20, 50, 350, 120);
			listaAlunosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaAlunosCadastrados.setVisibleRowCount(10);

			cadastroAluno.setBounds(70, 177, 100, 30);
			refreshAluno.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaAlunosCadastrados);
			janela.add(cadastroAluno);
			janela.add(refreshAluno);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroAluno.addActionListener(this);
			refreshAluno.addActionListener(this);
			listaAlunosCadastrados.addListSelectionListener(this);

			break;

		/*case 2:// Mostrar dados de professores cadastrados (JList)
			listaNomes = new ControleProfessor(dados).getNomeProf();
			listaProfsCadastrados = new JList<String>(listaNomes);
			janela = new JFrame("Professores");
			titulo = new JLabel("Professores Cadastrados");
			cadastroProf = new JButton("Cadastrar");
			refreshProf = new JButton("Refresh");

			titulo.setFont(new Font("Arial", Font.BOLD, 20));
			titulo.setBounds(90, 10, 250, 30);
			listaProfsCadastrados.setBounds(20, 50, 350, 120);
			listaProfsCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listaProfsCadastrados.setVisibleRowCount(10);


			cadastroProf.setBounds(70, 177, 100, 30);
			refreshProf.setBounds(200, 177, 100, 30);

			janela.setLayout(null);

			janela.add(titulo);
			janela.add(listaProfsCadastrados);
			janela.add(cadastroProf);
			janela.add(refreshProf);

			janela.setSize(400, 250);
			janela.setVisible(true);

			cadastroProf.addActionListener(this);
			refreshProf.addActionListener(this);
			listaProfsCadastrados.addListSelectionListener(this);
			break;
*/
		default:
			JOptionPane.showMessageDialog(null,"Opção não encontrada!", null, 
					JOptionPane.ERROR_MESSAGE);
		}

	}



	//Captura eventos relacionados aos botões da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		//Cadastro de novo aluno
		if(src == cadastroAluno)
			new TelaOpcoes().actionPerformed(e);



		// Atualiza a lista de nomes de alunos mostrada no JList
		if(src == refreshAluno) {
			String[] nomesProdutos = new String[dados.getProdutos().size()];
			for (int i=0; i<dados.getProdutos().size();i++) {
				nomesProdutos[i]= dados.getProdutos().get(i).getNome();
			}
			
			listaAlunosCadastrados.setListData(nomesProdutos);			
			listaAlunosCadastrados.updateUI();
		}



	}

	//Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaAlunosCadastrados) {
			new TelaDetalhe().inserirEditar(3, dados, this, 
					listaAlunosCadastrados.getSelectedIndex());
		}

	}

}