package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controleacademico.Aluno;
import controleacademico.Disciplina;
import controleacademico.Professor;

class TestDisciplina {
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
	
	
	//Aluno a1 = Widson Melo
    a1 = new Aluno();
    a1.setNome("Widson Melo");
    a1.setMatricula(111111);             
    
    //Aluno a2 = José George
    a2 = new Aluno();
    a2.setNome("José George");
    a2.setMatricula(222222);                                
    
    //Aluno a3 = Pablo Monteiro
    a3 = new Aluno();
    a3.setNome("Pablo Monteiro");
    a3.setMatricula(333333);                
    
    //Aluno a4 = Sergio Davi
    a4 = new Aluno();
    a4.setNome("Sergio Davi");
    a4.setMatricula(444444);                
    
    //Aluno a5 = Samuel Junior
    a5 = new Aluno();
    a5.setNome("Samuel Junior");
    a5.setMatricula(555555); 
				
	}

	@Test
	void testAdicionarAlunoNaDisciplina() {
		Disciplina.adicionarAlunoNaDisciplina(d1, a1);		
		Aluno valorAtual = d1.listaDeAlunosNaDisciplina.get(0);			
		assertEquals(a1, valorAtual);
	}	

	@Test
	void testNumeroDeAlunosDaDisciplina() {
		Disciplina.adicionarAlunoNaDisciplina(d2, a1);
		Disciplina.adicionarAlunoNaDisciplina(d2, a2);
		Disciplina.adicionarAlunoNaDisciplina(d2, a3);
		Disciplina.adicionarAlunoNaDisciplina(d2, a4);
		
		int valorAtual = d2.listaDeAlunosNaDisciplina.size();
		assertEquals(4, valorAtual);
	}

}
