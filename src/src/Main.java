import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public Main() {
		Scanner s = new Scanner(System.in);
		try {
			s = new Scanner(new File("C:/Users/Varas/IdeaProjects/TestNWAPW/src/Test.txt"));
		}catch (IOException e) {
			System.out.println(e);
		}
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
}
