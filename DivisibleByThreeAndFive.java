package packagee;

public class DivisibleByThreeAndFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 30;

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Number is divisible by both 3 and 5");
        } else {
            System.out.println("Number is not divisible by both 3 and 5");
        }
    }
}