package gestaoDisciplinas;

import java.util.ArrayList;

public class Disciplina {
	private String nome;
	private String sigla;
	private int capacidade;
	private ArrayList<Inscricao> inscricoes;

	public Disciplina(String nome, String sigla, int capacidade) {
		this.nome = nome;
		this.sigla = sigla;
		this.capacidade = capacidade;
		inscricoes = new ArrayList<>();
	}

	public void inscrever(Aluno aluno) {
		if (inscricoes.size() == capacidade)
			System.out.println("Disciplina sem espaço!");
		Inscricao inscricao = new Inscricao(aluno);
		inscricoes.add(inscricao);
	}

	public void desinscrever(int numero) {
		
		Inscricao var = procura(numero);
		if (var != null)
				inscricoes.remove(var);
		else
		
		System.out.println("Não existe esse aluno!");
		
	}

	private Inscricao procura(int nAluno) {
		for (Inscricao inscricao : inscricoes)
			if (inscricao.getAluno().getNumero() == nAluno)
				return inscricao;
		return null;
	}

	
	public void lancarNota(int numero, int nota) {
		Inscricao var = procura(numero);
		
		if (var == null)
			System.out.println("Não existe esse aluno!");
		else
			var.setNota(nota);
		
	}

	public boolean temNota(int numero) {
		Inscricao var = procura(numero);
		if (var.getNota() > 0 && var.getNota()< 20) 
			return true;
		else
			return false;
	}
	
	public int obterNota(int numero) {
		Inscricao var = procura(numero);
		if (temNota(numero))
			return var.getNota();
		else
			return Inscricao.NA;
	}
	
	
	
}
