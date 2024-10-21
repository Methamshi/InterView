package Java;

import java.util.Scanner;

public class Word_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcome();
		
	}

	private static void welcome() {
		System.out.println("Welocme please select option");
		System.out.println("1: Enter the input");
		System.out.println("2: Exit");

		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();

		switch (i) {
		case 1:
			execute();
			welcome();
			break;
		case 2:
			System.out.println("Thank you.....");
		}
	}

	private static void execute() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the sentance to count the words");
		String sentance = scanner.nextLine();
		int total=1;
		int i=0;
		while(i<sentance.length()) {
			
			if((sentance.charAt(i)== ' ')&&(sentance.charAt(i+1)!= ' ')) {
				total++;
			}
			i++;
		}
		System.out.println(" number words in a sentance = "+ total);
		
	
	}
	}


