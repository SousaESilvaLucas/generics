package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.LogEntry;

public class Ex1Set {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		Set <LogEntry> uniqueUsers = new HashSet<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while(line != null) {
				String [] data = line.split(" ");
				String name = data[0];
				Date time = sdf.parse(data[1]);
				uniqueUsers.add(new LogEntry(name, time));
				line = br.readLine();
			}
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total users: " + uniqueUsers.size());
		sc.close();

	}

}
