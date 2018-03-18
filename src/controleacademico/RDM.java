package controleacademico;

public class RDM {
	void RDM(String nomeAluno, String matriculaAluno, String nomeDisciplina, String codigoDisciplina,
			String cargaHorariaDisciplina, String salaDisciplina, String horarioDisciplina, Professor professorResponsavel,
			String nomeProfessor, String matriculaProfessor) {
		
		Aluno aluno = new Aluno();
		aluno.setNome(nomeAluno);
		aluno.setMatricula(matriculaAluno);
		
		Disciplina disciplina = new Disciplina();
		disciplina.setNome(nomeDisciplina);
		disciplina.setCodigo(codigoDisciplina);
		disciplina.setCargaHoraria(cargaHorariaDisciplina);
		disciplina.setSala(salaDisciplina);
		disciplina.setHorario(horarioDisciplina);
		disciplina.setProfessorResponsavel(professorResponsavel);
		
		Professor professor = new Professor();
		professor.setNome(nomeProfessor);
		professor.setMatricula(matriculaProfessor);									
		
	}

}
