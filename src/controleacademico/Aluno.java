package controleacademico;

import java.util.ArrayList;

public class Aluno {

	public String nomeAluno;
	public ArrayList<String> listaDeDisciplinasDoAluno = new ArrayList<>();
	public ArrayList<String> listaDeHorariosDoAluno = new ArrayList<>();

	public Aluno(String nomeAluno) {
		setNome(nomeAluno);
		RDM.adicionarAlunoNaLista(this);
	}

	public static boolean adicionarDisciplinaAoAluno(Aluno aluno, Disciplina disciplina) {		
		boolean disciplinaExiste = aluno.listaDeDisciplinasDoAluno.contains(disciplina);
		if (disciplinaExiste == true) {
			System.out.println("o aluno já está na disciplina");
			return false;
		} else {
			aluno.listaDeDisciplinasDoAluno.add(disciplina.getNomeDisciplina());
			aluno.listaDeHorariosDoAluno.add(disciplina.getHorarioDisciplina());			
			System.out.println("O aluno " + aluno.getNome() + " foi adicionado na disciplina " + disciplina.getNomeDisciplina());
			return true;
		}
	}

	public static void disciplinasDoAluno(Aluno aluno) {
		for (int i = 0; i < aluno.listaDeDisciplinasDoAluno.size(); i++) {
			System.out.println(
					"Disciplina " + aluno.listaDeDisciplinasDoAluno.get(i)+ " de " + aluno.getNome());
		}
	}

	public static void horariosDoAluno(Aluno aluno) {
		System.out.println("Aluno: " + aluno.getNome());
		for (int i = 0; i < aluno.listaDeDisciplinasDoAluno.size(); i++) {
			System.out.println(aluno.listaDeHorariosDoAluno.get(i));
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

}
