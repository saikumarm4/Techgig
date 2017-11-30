package techgig;

public class Day18_MinEffortMaxOutput {

	public static void main(String[] args) {
		int size = 13;
		int[] array = { 1, 2, 4, 7, 10, 11, 7, 12, 3, 7, 16, 18, 19 };
		int pivot = -1;
		int x = -1, y = -1;
		for (int i = 0; i < size - 1; i++) {
			if (array[i] <= array[i + 1])
				continue;
			pivot = array[i + 1];
			y = i + 1;
			break;
		}
		for (int i = 0; i < size - 1; i++) {
			if (array[i] <= pivot)
				continue;
			x = i;
			break;
		}

		System.out.println(x + " " + y);
		System.out.println(array[x] + "  " + array[y]);
	}
}
