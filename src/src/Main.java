import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	ArrayList<String> questionsMain = new ArrayList<String>();

	public Main() {
		Scanner s = new Scanner(System.in);
		System.out.println(s.next());
		System.out.println("This is a (very difficult) test.");
		
		boolean bool;
		while (bool) {
			System.out.println("Type 'c' to create a new question\nType 'r' to read all questions");
			String act = s.nextLine();
			
			if (act.equalsIgnoreCase("c")) {
				create();
			}
			else if (act.equalsIgnoreCase("r")) {
				read();
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
	
	public void read(String[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
	public void create() {
		Scanner sc = new Scanner();
		System.out.println("Please submit your question...");
		String question = sc.nextLine();
		questionsMain.add(question);
	}
}