package application;

import model.entities.Client;

public class Program4 {

	public static void main(String[] args) {
		
		Client ana = new Client("ana", "anabanana@gmail.com");
		Client pedro = new Client("ana", "pedrão@gmail.com");
		Client ana2 = ana;
		
		System.out.println(ana.hashCode());
		System.out.println(pedro.hashCode());
		System.out.println(ana.equals(pedro));

	}

}
