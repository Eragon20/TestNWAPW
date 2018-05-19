import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	ArrayList<String> questionsMain = new ArrayList<String>();

	public Main() {
		Scanner s = new Scanner("Test");
		System.out.println(s.next());
		System.out.println("This is a (very difficult) test.");
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

