package Logic;

public class PrimeNumber {
	public static void m1() {
		int number = 11;
		int count = 0;
		int temp = number;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		System.out.println(count);
		if (temp == count) {
			System.out.println("yes its prime number");
		} else {
			System.out.println("no prime number");
		}
	}

	public static void main(String[] args) {
		m1();
	}
}
