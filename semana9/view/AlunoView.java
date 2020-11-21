package semana9.view;

import java.util.Scanner;

import semana9.bo.Aluno;
import semana9.controller.AlunoController;

public class AlunoView {

	public void create() {
		Scanner in = new Scanner(System.in);

		Aluno aluno = new Aluno();

		// ler os dados
		System.out.println("Entre com o nome do usuário:");
		aluno.setUsername(in.next());

		System.out.println("Entre com o email:");
		aluno.setEmail(in.next());

		System.out.println("Entre com a senha:");
		aluno.setPassword(in.next());

		// passar aluno para o controller
		AlunoController controller = new AlunoController();
		controller.create(aluno);

	}

	public void update() {
		Scanner in = new Scanner(System.in);

		Aluno aluno = new Aluno();

		// ler os dados
		System.out.println("Deseja alterar o nome do usuário(Y/n):");

		if (in.next().equals("Y")) {
			System.out.println("Digite o nome do usuário:");
			aluno.setUsername(in.next());
		}

		System.out.println("Deseja alterar o email do usuário(Y/n):");
		if (in.next().equals("Y")) {
			System.out.println("Digite o email do usuário:");
			aluno.setEmail(in.next());
		}
		System.out.println("Deseja alterar a senha dod usuário(Y/n):");
		if (in.next().equals("Y")) {
			System.out.println("Digite a senha do usuário:");
			aluno.setPassword(in.next());
		}
		in.close();

		AlunoController controller = new AlunoController();
		controller.update(aluno);
	}

	public void delete() {
		Scanner in = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Digite o nome do usuário:");
		aluno.setUsername(in.next());
		in.close();

		AlunoController controller = new AlunoController();
		controller.delete(aluno);
	}

	public void read() {
		AlunoController controller = new AlunoController();
		System.out.println("Listagem de Alunos");
		System.out.println("############################");
		for (Aluno aluno : controller.read()) {
			System.out.println("Username: " + aluno.getUsername());
			System.out.println("Email: " + aluno.getEmail());
			System.out.println("-----------------------------------");
		}

	}

	public static void main(String[] args) {

		AlunoView crud = new AlunoView();

		int continuar = 1;
		Scanner in = new Scanner(System.in);
		while (continuar != 0) {
			System.out.println("Menu");
			System.out.println("-----");
			System.out.println("1 - create");
			System.out.println("2 - read");
			System.out.println("3 - update");
			System.out.println("4 - delete");
			System.out.println("0 - sair");

			continuar = in.nextInt();

			if (continuar == 1)
				crud.create();
			else if (continuar == 2)
				crud.read();
			else if (continuar == 3)
				crud.update();
			else if (continuar == 4)
				crud.delete();

		}
		in.close();
		System.out.println("Fim de cadastro!");

	}

}
