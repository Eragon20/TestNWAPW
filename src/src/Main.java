import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	ArrayList<String> questionsMain = new ArrayList<String>();

	public Main() {
		Scanner s = new Scanner(System.in);

		try {
			s = new Scanner(new File("C:/Users/Varas/IdeaProjects/TestNWAPW/src/Test.txt"));
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println(s.next());
		System.out.println("This is a (very difficult) test.");
		
		boolean bool = true;
		while (bool) {
			System.out.println("Type 'c' to create a new question\nType 'r' to read all questions");
			String act = s.nextLine();
			
			if (act.equalsIgnoreCase("c")) {
				create();
			}
			else if (act.equalsIgnoreCase("r")) {
				read(questionsMain);
			}
			else {
				System.out.println("you're a failure. Please follow directions.");
				bool = false;
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