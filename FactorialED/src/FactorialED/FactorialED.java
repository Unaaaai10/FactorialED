package FactorialED;

public class FactorialED {

	public static void main(String[] args) {
		int num = Console.readInt();
		while (num != 0) {
			int count = 1;
			int fact = 1;
			while (count <= num) {
				fact = fact * count;
				count++;
			}
			System.out.println("Factorial: " + fact);
			num = Console.readInt();
		}
	}
}