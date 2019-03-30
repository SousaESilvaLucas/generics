package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.PrintService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		PrintService <String> ps = new PrintService<>();
		
		//ps.addValue("Maria");
		System.out.print("How many values? ");
		int nValues = sc.nextInt();
		
		for (int i = 1; i <= nValues; i++) {
			ps.addValue(sc.next());
		}

		ps.print();
		sc.close();

	}

}
