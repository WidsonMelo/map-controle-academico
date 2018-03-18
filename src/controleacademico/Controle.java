package controleacademico;

import java.util.ArrayList;

public class Controle {
	static ArrayList<Disciplina> listaDeDisciplinas = new ArrayList<>();
	static ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
	static ArrayList<Professor> listaDeProfessores = new ArrayList<>();

	public static void adicionarDisciplinaNaLista(Disciplina disciplina) {
		boolean disciplinaExiste = listaDeDisciplinas.contains(disciplina);
		if (disciplinaExiste == true) {
			System.out.println("A disciplina " + disciplina.nomeDisciplina + " já existe");
		} else {
			listaDeDisciplinas.add(disciplina);			
			System.out.println("A disciplina " + disciplina.nomeDisciplina + " foi adicionada");
		}
	}

	public static void adicionarAlunoNaLista(Aluno aluno) {
		boolean alunoExiste = listaDeAlunos.contains(aluno);
		if (alunoExiste == true) {
			System.out.println("O aluno " + aluno.nomeAluno + " já existe");
		} else {
			listaDeAlunos.add(aluno);			
			System.out.println("O aluno " + aluno.nomeAluno + " foi adicionado");
		}
	}

	public static void adicionarProfessorNaLista(Professor professor) {
		boolean professorExiste = listaDeProfessores.contains(professor);
		if (professorExiste == true) {
			System.out.println("O professor " + professor.nomeProfessor + " já existe");
		} else {
			listaDeProfessores.add(professor);
			System.out.println("O professor " + professor.nomeProfessor + " foi adicionado");
		}
	}

}
