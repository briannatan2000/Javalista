package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import controle.*;
import modelo.UnidadeDeMedida;

public class TelaUnidadeMedida implements ActionListener {

	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelSigla = new JLabel("Sigla: ");
	private JTextField valorSigla;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[9];
	private static ControleDados dados;
	private int posicao;
	private int opcao;
	private String s;



	public void inserirEditar(int op, ControleDados d, 
			TelaEditaveis p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1) s = "Cadastro de Medidas";
		if (op == 2) s = "Detalhe da Medida";
		

		janela = new JFrame(s);


		

		//Preenche dados com dados do aluno clicado
		if (op == 2) {

			valorNome = new JTextField(dados.getMedidas().get(pos).getNome(), 200);
			valorSigla = new JTextField(String.valueOf(dados.getMedidas().get(pos).getSigla()),200);

			
			
		

		}  else { //N?o preenche com dados

			valorNome = new JTextField(200);
			valorSigla = new JTextField(200);
			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelSigla.setBounds(30, 50, 150, 25);
		valorSigla.setBounds(180, 50, 180, 25);


		//Coloca os campos relacionados a endereco se aluno
		if (op == 1 || op == 2 ) {
			this.janela.add(labelSigla);
			this.janela.add(valorSigla);

		}

		//Coloca campos relacionados a valor hora/aula se professor


		//Coloca botoes de excluir e salvar
		if (op == 2) {
			botaoSalvar.setBounds(120, 175, 115, 30);
			botaoExcluir.setBounds(245, 175, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 250);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	
	}


	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == botaoSalvar) {
			try {
				boolean res=false;
				if(opcao == 1) //cadastro de novo aluno
					novoDado[0] = Integer.toString(dados.getMedidas().size());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] =  valorNome.getText();
				novoDado[2] =  valorSigla.getText();
				
				if (opcao == 1){

					UnidadeDeMedida novaMedida = new UnidadeDeMedida(dados.getMedidas().size()+1,novoDado[1],novoDado[2]);
					dados.getMedidas().add(novaMedida);
					res = true;
				} 
				if (opcao == 2) {

					UnidadeDeMedida novaMedida = new UnidadeDeMedida(posicao,novoDado[1],novoDado[2]);
					dados.getMedidas().set(posicao, novaMedida);
					res = true;
				}

				if(res) {
					mensagemSucessoCadastro();
				}
				else mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if(src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {//exclui unidade de Medida
				dados.getMedidas().remove(posicao);
				res = true;
				if (res) mensagemSucessoExclusao(); 
				else mensagemErroExclusaoAluno(); 
			}
							
		}
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,"ERRO AO SALVAR OS DADOS!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. CPF, identidade, DDD e telefone n?o cont?m apenas n?meros", null, 
				JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoAluno() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o aluno est? matriculado\n"
				+ "em alguma disciplina. Se sim, cancele\n "
				+ "a matricula e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void mensagemErroExclusaoProf() {
		JOptionPane.showMessageDialog(null,"Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o professor est? respons?vel\n"
				+ "por alguma disciplina. Se sim, substitua\n "
				+ "o professor e tente novamente.", null, 
				JOptionPane.ERROR_MESSAGE);
	}

}