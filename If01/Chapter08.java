package If01;

public class Chapter08 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 5) {
			System.out.println(number*number);
			number ++;
		}

		int[] array = {1,2,3,4};
		for (int num = 0; num < array.length; num++) {
			System.out.println(array[num]);
		}

		for (int num :array) {
			if (num%2 == 0) {
				continue;
			}
			System.out.println(num);
		}
	}
}
