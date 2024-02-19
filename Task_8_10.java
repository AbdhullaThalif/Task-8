package javaprogramming;

public class Task_8_10 {

	public static void main(String args[]) {
		int count = 0, x = 12345678;
		while (x != 0) {
			x = x / 10;
			count++;
		}
		System.out.println("Number of digits in an integer: " + count);
	}
}
