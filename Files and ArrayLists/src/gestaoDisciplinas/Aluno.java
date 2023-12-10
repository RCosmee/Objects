package gestaoDisciplinas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
	private int numero;
	private String nome;

	// construtor
	public Aluno(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;

	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public String toString() {
		String result = "Nr: " + numero + "; Nome: " + nome;
		return result;
	}

	public static ArrayList<Aluno> lerAlunos(String filename) {
		ArrayList<Aluno> alunos = new ArrayList<>();
		try {
			File f = new File(filename + ".txt");
			Scanner s = new Scanner(f);

	
			
			//for (String str : list)
			//	System.out.print(str + " ");
			//System.out.println();
					
			while (s.hasNextLine()) {
				int numero = s.nextInt();
				String nome = s.nextLine();
				
				Aluno aluno = new Aluno (numero, nome);
				alunos.add(aluno);
				
				
			}
			s.close();
		} catch (FileNotFoundException e) {
			System.err.println("Ficheiro nao encontrado");
			e.printStackTrace();
		}
		return alunos;
	}

}
