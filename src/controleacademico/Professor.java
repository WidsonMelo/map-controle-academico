package controleacademico;

import java.util.ArrayList;

public class Professor {

	public String nomeProfessor;
	public static ArrayList<Disciplina> listaDeDisciplinasDoProfessor = new ArrayList<>();

	public Professor(String nomeProfessor) {
		setNomeProfessor(nomeProfessor);
		Controle.adicionarProfessorNaLista(this);
	}

	public static void disciplinasDoProfessor(Professor professor) {
		for (int i = 0; i < professor.listaDeDisciplinasDoProfessor.size(); i++) {
			System.out.println("Disciplina " + professor.listaDeDisciplinasDoProfessor.get(i).getNomeDisciplina()
					+ " de " + professor.getNomeProfessor());
		}
	}

	public static void horariosDoProfessor(Professor professor) {
		System.out.println("Professor: " + professor.getNomeProfessor());
		for (int i = 0; i < professor.listaDeDisciplinasDoProfessor.size(); i++) {
			System.out.println(professor.listaDeDisciplinasDoProfessor.get(i).getHorarioDisciplina());
		}
	}

	public static boolean adicionarDisciplinaAoProfessor(Disciplina disciplina, Professor professor) {
		boolean disciplinaExiste = professor.listaDeDisciplinasDoProfessor.contains(disciplina);
		if (disciplinaExiste == true) {
			System.out.println("o professor já está na disciplina");
			return false;
		} else {
			professor.listaDeDisciplinasDoProfessor.add(disciplina);

			System.out.println("o aluno não estava na disciplina, foi adicionado");
			return true;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeProfessor == null) ? 0 : nomeProfessor.hashCode());
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
		Professor other = (Professor) obj;
		if (nomeProfessor == null) {
			if (other.nomeProfessor != null)
				return false;
		} else if (!nomeProfessor.equals(other.nomeProfessor))
			return false;
		return true;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	

}
