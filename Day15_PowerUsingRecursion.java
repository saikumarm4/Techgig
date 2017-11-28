package techgig;

public class Day15_PowerUsingRecursion {
	public static void main(String[] args) {
		System.out.println(power(4, 3));
	}

	public static int power(int x, int y) {
		if (y == 0)
			return 1;
		return x * power(x, --y);
	}
}
