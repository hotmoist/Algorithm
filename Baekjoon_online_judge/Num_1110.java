import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
		int count = 0;
		String first_number;
		String circle_number;

		first_number = scan.next();

		// if first_number < 10, add "0"
		if (Integer.parseInt(first_number) < 10) {
			first_number = "0" + first_number;
		}

		// setting for circle_number
		if ((first_number.charAt(0) - '0' + first_number.charAt(1) - '0' + "").length() > 1) {
			circle_number = (first_number.charAt(1) - '0' + "")
					+ ((first_number.charAt(0) - '0' + first_number.charAt(1) - '0' + "").charAt(1) + "");
		} else {
			circle_number = (first_number.charAt(1) - '0' + "")
					+ (first_number.charAt(0) - '0' + first_number.charAt(1) - '0' + "");
		}
		
		count++;
		
		while (!first_number.equals(circle_number)) {

			if ((circle_number.charAt(0) - '0' + circle_number.charAt(1) - '0' + "").length() > 1) {
				circle_number = (circle_number.charAt(1) - '0' + "")
						+ ((circle_number.charAt(0) - '0' + circle_number.charAt(1) - '0' + "").charAt(1) + "");
			} else {
				circle_number = (circle_number.charAt(1) - '0' + "")
						+ (circle_number.charAt(0) - '0' + circle_number.charAt(1) - '0' + "");
			}

			count++;

		}

		System.out.println(count);

    }
}
