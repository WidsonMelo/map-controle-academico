package controleacademico;

import java.util.ArrayList;

public class Aluno {

	public String nomeAluno;
	public String matriculaAluno;
	public static ArrayList<Disciplina> listaDeDisciplinasDoAluno = new ArrayList<>();
	
	public Aluno() {
		Controle.adicionarAlunoNaLista(this);
	}

	public static boolean adicionarDisciplinaAoAluno(Aluno aluno, Disciplina disciplina) {
		boolean disciplinaExiste = aluno.listaDeDisciplinasDoAluno.contains(disciplina);
		if (disciplinaExiste == true) {
			System.out.println("o aluno já está na disciplina");
			return false;
		} else {
			aluno.listaDeDisciplinasDoAluno.add(disciplina);
			System.out.println("o aluno não estava na disciplina, foi adicionado");
			return true;
		}
	}
	
	public static void disciplinasDoAluno(Aluno aluno) {
    	for (int i = 0; i < aluno.listaDeDisciplinasDoAluno.size(); i++) {
        	System.out.println("Disciplina " + aluno.listaDeDisciplinasDoAluno.get(i).getNome() + " de " + aluno.getNome());			
		}
    }
	
	public static void horariosDoAluno(Aluno aluno) {
    	System.out.println("Aluno: " + aluno.getNome());
    	for (int i = 0; i < aluno.listaDeDisciplinasDoAluno.size(); i++) {
        	System.out.println(aluno.listaDeDisciplinasDoAluno.get(i).getHorario());			
		}    	
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeAluno == null) ? 0 : nomeAluno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nomeAluno == null) {
			if (other.nomeAluno != null)
				return false;
		} else if (!nomeAluno.equals(other.nomeAluno))
			return false;
		return true;
	}

	public String getNome() {
		return nomeAluno;
	}

	public void setNome(String nome) {
		this.nomeAluno = nome;
	}

	public String getMatricula() {
		return matriculaAluno;
	}

	public void setMatricula(String matricula) {
		this.matriculaAluno = matricula;
	}

}
