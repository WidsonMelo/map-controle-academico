package controleacademico;

import java.util.ArrayList;

public class Professor {

	public String nomeProfessor;
	public static ArrayList<String> listaDeDisciplinasDoProfessor = new ArrayList<>();
	public static ArrayList<String> listaDeHorariosDoProfessor = new ArrayList<>();

	public Professor(String nomeProfessor) {
		setNomeProfessor(nomeProfessor);
		RDM.adicionarProfessorNaLista(this);
	}

	public static void disciplinasDoProfessor(Professor professor) {
		for (int i = 0; i < professor.listaDeDisciplinasDoProfessor.size(); i++) {
			System.out.println("Disciplina " + professor.listaDeDisciplinasDoProfessor.get(i) + " de " + professor.getNomeProfessor());
		}
	}

	public static void horariosDoProfessor(Professor professor) {
		System.out.println("Professor: " + professor.getNomeProfessor());			
		for (int i = 0; i < professor.listaDeDisciplinasDoProfessor.size(); i++) {
			System.out.println(professor.listaDeHorariosDoProfessor.get(i));
		}
	}
	
	public static boolean adicionarDisciplinaAoProfessor(Professor professor, Disciplina disciplina) {
		boolean disciplinaExiste = professor.listaDeDisciplinasDoProfessor.contains(disciplina.getNomeDisciplina());
		if (disciplinaExiste == true) {
			System.out.println("O professor " + professor.getNomeProfessor() + " já está na disciplina " + disciplina.getNomeDisciplina());
			return false;
		} else {
			professor.listaDeDisciplinasDoProfessor.add(disciplina.getNomeDisciplina());
			professor.listaDeHorariosDoProfessor.add(disciplina.getHorarioDisciplina());
			System.out.println("A disciplina " + disciplina.getNomeDisciplina() + " foi adicionada ao professor " + professor.getNomeProfessor());
			return true;
		}
	}

//	public static boolean adicionarDisciplinaAoProfessor(Disciplina disciplina, Professor professor) {
//		boolean disciplinaExiste = professor.listaDeDisciplinasDoProfessor.contains(disciplina);
//		if (disciplinaExiste == true) {
//			System.out.println("o professor já está na disciplina");
//			return false;
//		} else {
//			professor.listaDeDisciplinasDoProfessor.add(disciplina.getNomeDisciplina());
//			professor.listaDeHorariosDoProfessor.add(disciplina.getHorarioDisciplina());
//
//			System.out.println("O professor " + professor.getNomeProfessor() + " foi adicionado na disciplina " + disciplina.getNomeDisciplina());
//			return true;
//		}
//	}

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
