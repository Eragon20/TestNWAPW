import java.util.Scanner;

public class Main {

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
}
