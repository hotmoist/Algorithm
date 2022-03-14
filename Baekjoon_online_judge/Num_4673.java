public class Main {
	public static void main(String[] args) {
		int[] array = new int[10001];

		for (int i = 1; i <= 10000; i++) {
			array[i] = i;
		}
		for (int i = 1; i <= 10000; i++) {
			String s = d(Integer.toString(i));
			int num = Integer.parseInt(s);

			if (num <= 10000)
				array[num] = 0;

			s = d(s);
		}

		for (int i : array) {
			if (array[i] != 0) {
				System.out.println(array[i]);
			}
		}
	}

	public static String d(String n) {
		int num = Integer.parseInt(n);

		if (num < 10000) {

			for (int i = 0; i < n.length(); i++) {
				num += (n.charAt(i) - 48);
			}
		}
		return Integer.toString(num);

	}

}
