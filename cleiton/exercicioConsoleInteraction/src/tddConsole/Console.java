package tddConsole;

import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Console {

	Scanner receba = new Scanner(System.in);
	private int opcao;
	


	public boolean menu() {
		System.out.println("Digite opcao 1 ou 2");
		opcao = Integer.parseInt(receba.nextLine());
		
		setOpcao(opcao);
		
		if(opcao == 1 || opcao == 2)
			return true;
		return false;
	}
	
	
	
	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}



	public boolean calculaAreaRetangulo() {
		// TODO Auto-generated method stub
		return true;
	}

}
