package controleacademico;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Disciplina {

	public String nomeDisciplina;
	public String codigoDisciplina;
	public String cargaHorariaDisciplina;
	public String salaDisciplina;
	public String horarioDisciplina;
	public Professor professorResponsavelDisciplina;
	public static ArrayList<Aluno> listaDeAlunosNaDisciplina = new ArrayList<>();
	
	public Disciplina() {
		Controle.adicionarDisciplinaNaLista(this);
		
	}	
	

	public static void adicionarAlunoNaDisciplina(Disciplina disciplina, Aluno aluno) {
		boolean alunoExiste = disciplina.listaDeAlunosNaDisciplina.contains(aluno);
		if (alunoExiste == true) {
			System.out.println("o aluno " + aluno.getNome() + " já está na disciplina");
		} else {
			disciplina.listaDeAlunosNaDisciplina.add(aluno);
			aluno.listaDeDisciplinasDoAluno.add(disciplina);
			System.out.println("o aluno " + aluno.getNome() + " foi adicionado na disciplina " + disciplina.getNome());
		}

	}
	
	public static void alunosDaDisciplina(Disciplina disciplina) {
		System.out.println("==============Alunos da disciplina===============");
		System.out.println("Disciplina " + disciplina.getNome());
    	for (int i = 0; i < disciplina.listaDeAlunosNaDisciplina.size(); i++) {
        	System.out.println(disciplina.listaDeAlunosNaDisciplina.get(i).getNome());			
		}
    }
	
	public static void numeroDeAlunosDaDisciplina(Disciplina disciplina) {
		System.out.println("==========Número de Alunos da disciplina===========");
		System.out.println("Disciplina " + disciplina.getNome());
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
		listaDeAlunosNaDisciplina.add(aluno);
	}

	public String getNome() {
		return nomeDisciplina;
	}

	public void setNome(String nome) {
		this.nomeDisciplina = nome;
	}

	public String getCodigo() {
		return codigoDisciplina;
	}

	public void setCodigo(String codigo) {
		this.codigoDisciplina = codigo;
	}

	public String getCargaHoraria() {
		return cargaHorariaDisciplina;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHorariaDisciplina = cargaHoraria;
	}

	public String getSala() {
		return salaDisciplina;
	}

	public void setSala(String sala) {
		this.salaDisciplina = sala;
	}

	public String getHorario() {
		return horarioDisciplina;
	}

	public void setHorario(String horario) {
		this.horarioDisciplina = horario;
	}

	public Professor getProfessorResponsavel() {
		return professorResponsavelDisciplina;
	}

	public void setProfessorResponsavel(Professor professorResponsavel) {
		this.professorResponsavelDisciplina = professorResponsavel;
	}	

}