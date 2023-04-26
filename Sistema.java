import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		String[] nome = { "Ricardo", "Luís", "Pedro", "João", "Lucas", "Wesley", "Flávia", "Rebeca", "Kátia",
				"Bianca" };
		int resultado = 0;
		int[] nota1 = { 10, 4, 3, 6, 8, 7, 9, 1, 5, 2 };
		int[] nota2 = { 4, 6, 8, 9, 5, 2, 10, 1, 7, 6 };
		int[] nota3 = { 7, 4, 9, 1, 6, 2, 8, 10, 5, 3 };
		int[] nota4 = { 3, 1, 9, 7, 8, 4, 5, 2, 6, 10 };
		float media;
		int analise = 0;
		System.out.println("========================================");
		System.out.println("Sistema de Notas");
		while (analise < 1) {
			System.out.println("========================================");
			System.out.println("1 - Consultar o aluno e a média pelo RA");
			System.out.println("2 - Mostrar todos os registros");
			System.out.println("3 - Sair do sistema");
			System.out.println("========================================");
			System.out.println("Digie o número da opção desejada:");
			Scanner sc = new Scanner(System.in);
			resultado = sc.nextInt();
			switch (resultado) {
			case 1:
				System.out.println("Digite o RA do aluno desejado:");
				int aluno = sc.nextInt();
				media = (nota1[aluno] + nota2[aluno] + nota3[aluno] + nota4[aluno]) / 4;
				System.out.println("Nome - Nota 1 - Nota 2 - Nota 3 - Nota 4 - Média - Conceito");
				String conceito;
				if (media < 5) {
					conceito = "Reprovado";
				} else if (media > 5) {
					conceito = "Aprovado";
				} else
					conceito = "Recuperação";
				System.out.println(nome[aluno] + " - " + nota1[aluno] + " - " + nota2[aluno] + " - " + nota3[aluno]
						+ " - " + nota4[aluno] + " - " + media + " - " + conceito);
				analise++;
				break;
			case 2:
				System.out.println("Nome - Nota 1 - Nota 2 - Nota 3 - Nota 4 - Média - Conceito");
				for (int contador = 0; contador < nome.length; contador++) {
					media = (nota1[contador] + nota2[contador] + nota3[contador] + nota4[contador]) / 4;
					if (media < 5) {
						conceito = "Reprovado";
					} else if (media > 5) {
						conceito = "Aprovado";
					} else
						conceito = "Recuperação";
					System.out.println(nome[contador] + " - " + nota1[contador] + " - " + nota2[contador] + " - "
							+ nota3[contador] + " - " + nota4[contador] + " - " + media + " - " + conceito);
				}
				analise++;
				break;
			case 3:
				System.out.println("Saindo do sistema...");
				analise++;
				System.exit(0);
			default:
				System.out.println("Opção inválida...");
				analise = 0;
			}
			sc.close();
		}
	}
}