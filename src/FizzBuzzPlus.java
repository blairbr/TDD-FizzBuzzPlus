public class FizzBuzzPlus {
	
	public static void main(String[] args) {

		for (int i = 1; i < 101; i++) {

			String result = "";

			if (i % 3 == 0) {
				result = "Fizz";
			}
			if (i % 5 == 0) {
				result = result + "Buzz";
			}
			if (Integer.toString(i).contains("3")) {
				result = result + "Fizz";
			}
			if (Integer.toString(i).contains("5")) {
				result = result + "Buzz";
			}
			if (result == "") {
				result = result + i;
			}

			System.out.println(result);

		}
	}
}