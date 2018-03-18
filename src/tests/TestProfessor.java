package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controleacademico.Aluno;
import controleacademico.Disciplina;
import controleacademico.Professor;

class TestProfessor {
	public static Disciplina d1, d2, d3, d4, d5;
	public static Professor p1, p2, p3, p4, p5;
	public static Aluno a1, a2, a3, a4, a5;

	@BeforeEach
	void setUp() throws Exception {
		// Disciplina d1 = Calculo 1
		d1 = new Disciplina();
		d1.setNome("Cálculo 1");
		d1.setCodigo("01");
		d1.setSala("A203");
		d1.setCargaHoraria(60);
		d1.setHorario("07:00");

		// Disciplina d2 = Algebra Linear
		d2 = new Disciplina();
		d2.setNome("Álgebra Linear");
		d2.setCodigo("02");
		d2.setSala("B404");
		d2.setCargaHoraria(60);
		d2.setHorario("09:00");

		// Disciplina d3 = Algoritmo
		d3 = new Disciplina();
		d3.setNome("Algoritmo");
		d3.setCodigo("03");
		d3.setSala("Psico 104");
		d3.setCargaHoraria(60);
		d3.setHorario("11:00");

		// Disciplina d4 = Programacao OO
		d4 = new Disciplina();
		d4.setNome("Programação OO");
		d4.setCodigo("04");
		d4.setSala("Odonto 12");
		d4.setCargaHoraria(60);
		d4.setHorario("18:00");

		// Disciplina d5 = Computacao Grafica
		d5 = new Disciplina();
		d5.setNome("Computação Gráfica");
		d5.setCodigo("05");
		d5.setSala("CCT 303");
		d5.setCargaHoraria(60);
		d5.setHorario("20:00");
		
		// Professor p1 = Paulo Eduardo
		p1 = new Professor();
		p1.setNome("Paulo Eduardo");
		p1.setMatricula(101010);

		// Professor p2 = Robson Pequeno
		p2 = new Professor();
		p2.setNome("Robson Pequeno");
		p2.setMatricula(202020);

		// Professor p3 = Janderson Jason
		p3 = new Professor();
		p3.setNome("Janderson Jason");
		p3.setMatricula(303030);

		// Professor p4 = Edson Holanda
		p4 = new Professor();
		p4.setNome("Edson Holanda");
		p4.setMatricula(404040);

		// Professor p5 = Allyson Milanez
		p5 = new Professor();
		p5.setNome("Allyson Milanez");
		p5.setMatricula(505050);
		
	}

	@Test
	void testDisciplinasDoProfessor() {
		Professor.adicionarDisciplinaAoProfessor(d1, p1);
		Professor.adicionarDisciplinaAoProfessor(d2, p1);	
		
		int valorAtual = p1.getListaDeDisciplinasDoProfessor().size();
		assertEquals(2, valorAtual);
	}

	@Test
	void testHorariosDoProfessor() {
		Professor.adicionarDisciplinaAoProfessor(d5, p1);
		String valorAtual = d5.getHorario();
		assertEquals("20:00", valorAtual);
	}

	@Test
	void testAdicionarDisciplinaAoProfessor() {		
		Professor.adicionarDisciplinaAoProfessor(d1, p2);
		Disciplina valorAtual = p2.listaDeDisciplinasDoProfessor.get(0);			
		assertEquals(d1, valorAtual);
	}

}
