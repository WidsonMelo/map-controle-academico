package controleacademico;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Disciplina {

	public String nomeDisciplina;
	public String horarioDisciplina;
	public Professor professorResponsavelDisciplina;
	public static ArrayList<String> listaDeAlunosNaDisciplina = new ArrayList<>();

	public Disciplina(String nomeDisciplina, String horarioDisciplina, Professor professor) {
		setNomeDisciplina(nomeDisciplina);
		setHorarioDisciplina(horarioDisciplina);
		setProfessorResponsavelDisciplina(professor);
		RDM.adicionarDisciplinaNaLista(this);

	}

	public static void adicionarAlunoNaDisciplina(Disciplina disciplina, Aluno aluno) {
		boolean alunoExiste = disciplina.listaDeAlunosNaDisciplina.contains(aluno);
		if (alunoExiste == true) {
			System.out.println("o aluno " + aluno.getNome() + " já está na disciplina");
		} else {
			disciplina.listaDeAlunosNaDisciplina.add(aluno.getNome());
			aluno.listaDeDisciplinasDoAluno.add(disciplina.getNomeDisciplina());
			System.out.println(
					"o aluno " + aluno.getNome() + " foi adicionado na disciplina " + disciplina.getNomeDisciplina());
		}

	}

	public static void alunosDaDisciplina(Disciplina disciplina) {
		System.out.println("==============Alunos da disciplina===============");
		System.out.println("Disciplina " + disciplina.getNomeDisciplina());
		for (int i = 0; i < disciplina.listaDeAlunosNaDisciplina.size(); i++) {
			System.out.println(disciplina.listaDeAlunosNaDisciplina.get(i));
		}
	}

	public static void numeroDeAlunosDaDisciplina(Disciplina disciplina) {
		System.out.println("==========Número de Alunos da disciplina===========");
		System.out.println("Disciplina " + disciplina.getNomeDisciplina());
		System.out.println(disciplina.listaDeAlunosNaDisciplina.size());
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 53 * hash + Objects.hashCode(this.nomeDisciplina);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Disciplina other = (Disciplina) obj;
		if (!Objects.equals(this.nomeDisciplina, other.nomeDisciplina)) {
			return false;
		}
		return true;
	}

	public void insereAlunoNaDisciplina(Aluno aluno) {
		listaDeAlunosNaDisciplina.add(aluno.getNome());
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

	public Professor getProfessorResponsavelDisciplina() {
		return professorResponsavelDisciplina;
	}

	public void setProfessorResponsavelDisciplina(Professor professorResponsavelDisciplina) {
		this.professorResponsavelDisciplina = professorResponsavelDisciplina;
	}

}