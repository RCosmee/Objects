package gestaoDisciplinas;

public class Inscricao {
	private int nota;
	private Aluno aluno;
	
	//constante
	public static final int NA = -1;
	
	public Inscricao(int nota, Aluno aluno) {
		this.nota = nota;
		this.aluno = aluno;
	}

	public Inscricao(Aluno aluno) {
		this.aluno = aluno;
		nota = NA;
	}
	public boolean temNota() {
		return nota >=0;
	}
	
	public void setNota(int nota) {
		if(nota < 0 || nota > 20) {
			System.err.println("Nota inválida");
		}
		else {
			this.nota = nota;
		}
	}
	
	public int getNota() {
		return nota;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
	
}
