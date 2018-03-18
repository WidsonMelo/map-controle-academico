package controleacademico;

import java.util.ArrayList;

public class Controle {
	static ArrayList<Disciplina> listaDeDisciplinas = new ArrayList<>();
	static ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
	static ArrayList<Professor> listaDeProfessores = new ArrayList<>();
	
	
	public static void adicionarDisciplinaNaLista(Disciplina disciplina) {
		boolean disciplinaExite = listaDeDisciplinas.contains(disciplina);
		if (disciplinaExite == true) {
			System.out.println("a disciplina j� existe, n�o foi adicionada");
		} else {
			listaDeDisciplinas.add(disciplina);
			System.out.println("Disciplina " + disciplina.getNome() + " foi adicionada");
		}
	}
		
		public static void adicionarAlunoNaLista(Aluno aluno) {
			boolean alunoExiste = listaDeAlunos.contains(aluno);
			if (alunoExiste == true) {
				System.out.println("o aluno j� existe, n�o foi adicionado");
			} else {
				listaDeAlunos.add(aluno);
				System.out.println("o aluno n�o existe, foi adicionado");
			}
		}
		
		public static void adicionarProfessorNaLista(Professor professor) {
			boolean professorExiste = listaDeProfessores.contains(professor);
			if (professorExiste == true) {
				System.out.println("o professor j� existe, n�o foi adicionado");
			} else {
				listaDeProfessores.add(professor);
				System.out.println("o professor n�o existe, foi adicionado");
			}
		}
		
		static public void cadastraDisciplinaParaProfessor(Disciplina disciplina, Professor professor) {
			disciplina.setProfessorResponsavel(professor);
			professor.listaDeDisciplinasDoProfessor.add(disciplina);			
			System.out.println("Disciplina " + disciplina.getNome() + " � ministrada por " + professor.getNome());
		}
	
	

}
