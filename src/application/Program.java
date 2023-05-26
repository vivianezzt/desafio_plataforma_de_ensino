package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Video;
import entities.Task;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Lesson> list = new ArrayList<>();

		System.out.print("QUANTAS AULAS TEM O CURSO? ? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("============================");
			System.out.printf("\nDADOS DA %d: \n", i + 1);
			System.out.print("CONTEÚDO OU TAREFA (C/T)?? ");
			char ch = sc.next().charAt(0);

			System.out.print("TÍTULO:  ");
			sc.nextLine();
			String title = sc.nextLine();

			if (ch == 'c') {
				System.out.print("URL DO VIDEO: ");
				String url = sc.next();
				System.out.print("DURAÇÃO EM SEGUNDOS: ");
				int seconds = sc.nextInt();
				list.add(new Video(title, url, seconds));
			} else {
				System.out.print("DESCRIÇÃO : ");
				String description = sc.nextLine();
				System.out.print("QUANTIDADE DE QUESTÕES: ");
				int questionCount = sc.nextInt();
				list.add(new Task(title, description, questionCount));
			}
		}

		int sum = 0;
		for (Lesson les : list) {
			sum += les.duration();
		}
		System.out.println("============================");
		System.out.printf("\nDURAÇÃO TOTAL DO CURSO = %d segundos", sum);

		sc.close();

	}

}
