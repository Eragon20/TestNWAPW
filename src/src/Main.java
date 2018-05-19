import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	ArrayList<String> questionsMain = new ArrayList<String>();

	public Main() {
		
		Scanner s = new Scanner(System.in);

		try {
			s = new Scanner(new File("src/Test.txt"));
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("This is a (very difficult) test.");
		
		boolean bool = true;
		while (bool) {
			System.out.println("Type 'c' to create a new question\nType 'r' to read all questions");
			Scanner sc1 = new Scanner(System.in);
			String act = sc1.nextLine();
		
			if (act.equalsIgnoreCase("c")) {
				create();
				System.out.println("Thanks! Another?");
			}
			
			else if (act.equalsIgnoreCase("r")) {
				read(questionsMain);
				System.out.println("Thanks! Another?");
			}
			else {
				System.out.println("you're a failure. Please follow directions.");
			}
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
	public void read(ArrayList<String> ar) {
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}
	
	public void create() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please submit your question...");
		String question = sc.nextLine();
		questionsMain.add(question);
	}
}