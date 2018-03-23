package controleacademico;

import java.util.ArrayList;

public class RDM {
	public static ArrayList<Disciplina> listaDeDisciplinas = new ArrayList<>();
	public static ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
	public static ArrayList<Professor> listaDeProfessores = new ArrayList<>();
	public static ArrayList<RDM> listaDeRDM = new ArrayList<>();
	public String nomeAluno;
	public String nomeDisciplina;
	public String horarioDisciplina;
	public String nomeProfessor;

	public RDM(String nomeAluno, String nomeDisciplina, String horarioDisciplina, String nomeProfessor) {
		this.setNomeAluno(nomeAluno);
		this.setNomeDisciplina(nomeDisciplina);
		this.setHorarioDisciplina(horarioDisciplina);
		this.setNomeProfessor(nomeProfessor);		
		RDM.listaDeRDM.add(this);
		
		Aluno aluno = new Aluno(nomeAluno);	
		Professor professor = new Professor(nomeProfessor);
		Disciplina disciplina = new Disciplina(nomeDisciplina, horarioDisciplina, professor);
		
		Aluno.adicionarDisciplinaAoAluno(aluno, disciplina);
		Professor.adicionarDisciplinaAoProfessor(professor, disciplina);		
			
		
		//lista de disciplinas do aluno
		System.out.println("lista de disciplinas de " + aluno.getNome());
		for (int i = 0; i < aluno.listaDeDisciplinasDoAluno.size(); i++) {
			System.out.println(aluno.listaDeDisciplinasDoAluno.get(i));
			
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
	
	public static void adicionarDisciplinaNaLista(Disciplina disciplina) {
		boolean disciplinaExiste = listaDeDisciplinas.contains(disciplina);
		if (disciplinaExiste == true) {
			System.out.println("A disciplina " + disciplina.nomeDisciplina + " já existe");
		} else {
			listaDeDisciplinas.add(disciplina);			
			System.out.println("A disciplina " + disciplina.nomeDisciplina + " foi adicionada");
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


	public String getNomeAluno() {
		return nomeAluno;
	}


	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}


	public String getNomeDisciplina() {
		return nomeDisciplina;
	}


	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}


	public String getHorarioDisciplina() {
		return horarioDisciplina;
	}


	public void setHorarioDisciplina(String horarioDisciplina) {
		this.horarioDisciplina = horarioDisciplina;
	}


	public String getNomeProfessor() {
		return nomeProfessor;
	}


	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}	

}
