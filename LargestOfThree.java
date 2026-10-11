package packagee;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a = 25;
	        int b = 50;
	        int c = 40;

	        if (a > b) {

	            if (a > c) {
	                System.out.println("A is Largest");
	            } else {
	                System.out.println("C is Largest");
	            }

	        } else {

	            if (b > c) {
	                System.out.println("B is Largest");
	            } else {
	                System.out.println("C is Largest");
	            }
	        }
	    }
	}