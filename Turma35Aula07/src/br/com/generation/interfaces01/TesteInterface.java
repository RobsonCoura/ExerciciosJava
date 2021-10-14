package br.com.generation.interfaces01;

public class TesteInterface {

	public static void main(String[] args) {
	
		ParticipanteForum participante = new ParticipanteForum();
		Leitor leitor = participante;
		
		System.out.println("O participante est� lendo: " + leitor.lendo());
		Programador programador = participante;
		String java = "Java";
		programador.pensando(java.toCharArray());
		System.out.println("E programando: " + programador.digitando());

	}

}
