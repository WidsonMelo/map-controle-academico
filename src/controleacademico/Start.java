package controleacademico;

import controleacademico.Professor;

public class Start {
	public static Disciplina d1, d2, d3, d4, d5;
	public static Professor p1, p2, p3, p4, p5;
	public static Aluno a1, a2, a3, a4, a5;

	public static void main(String[] args) {

		RDM widson = new RDM("Widson", "C�lculo Num�rico", "Seg. 18:00, Qui. 20:00", "Paulo Barbosa");
		System.out.println();
		
		RDM jose = new RDM("Jos� George", "C�lculo Num�rico", "Seg. 18:00, Qui. 20:00", "Paulo Barbosa");
		System.out.println();
		
		RDM pablo = new RDM("Pablo", "C�lculo Num�rico", "Seg. 18:00, Qui. 20:00", "Paulo Barbosa");
		System.out.println();
		
		RDM bianca = new RDM("Bianca", "Programa��o", "Seg. 18:00, Qui. 20:00", "Daniel");
		System.out.println();
		
		RDM test = new RDM("Bianca", "C�lculo Num�rico", "Seg. 18:00, Qui. 20:00", "Paulo Barbosa");
		System.out.println();			

	}
}
