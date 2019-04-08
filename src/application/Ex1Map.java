package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1Map {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// /home/lucas/eclipse-workspace/generics/inMap
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			Map <String, Integer> election = new HashMap<>();
			while(line != null) {
				String[] data = line.split(",");
				String candidate = data[0];
				Integer nVotes = Integer.parseInt(data[1]);
				
				if (election.containsKey(candidate)) {
					election.put(candidate, election.get(candidate) + nVotes);
				}
				else {
					election.put(candidate, nVotes);
				}		
				line = br.readLine();
			}
			for (String candidate : election.keySet()) {
				System.out.println(candidate + ": " + election.get(candidate) + " votes");
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
		


	}

}
