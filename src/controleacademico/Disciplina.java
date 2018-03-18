package controleacademico;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Disciplina {

	public String nome;
	public String codigo;
	public Integer cargaHoraria;
	public String sala;
	public String horario;
	public Professor professorResponsavel;
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
		hash = 53 * hash + Objects.hashCode(this.nome);
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
		if (!Objects.equals(this.nome, other.nome)) {
			return false;
		}
		return true;
	}

	public void insereAlunoNaDisciplina(Aluno aluno) {
		listaDeAlunosNaDisciplina.add(aluno);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessorResponsavel() {
		return professorResponsavel;
	}

	public void setProfessorResponsavel(Professor professorResponsavel) {
		this.professorResponsavel = professorResponsavel;
	}	

}