package teste;

import java.util.ArrayList;

import gestaoDisciplinas.Aluno;

public class MainGestaoDisciplinas {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno(111255, "Rodrigo Santos");
		
		System.out.println(aluno1.toString());
		
		ArrayList<Aluno> listaalunos = Aluno.lerAlunos("text");
		//for(int i = 0; i <= listaalunos.size();i++)
			//System.out.println(listaalunos.toString());
		
		for(Aluno a : listaalunos)
			System.out.println(a.toString());
	}
}
