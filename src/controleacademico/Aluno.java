package controleacademico;

import java.util.ArrayList;

public class Aluno {

	public String nome;
	public Integer matricula;
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
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

}
