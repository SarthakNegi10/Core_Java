package packagee;

public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int experience = 6;
	        double salary = 60000;
	        int bonus;

	        if (experience >= 5 && salary >= 50000) {

	            bonus = 10000;

	        } else {

	            if (experience >= 5 || salary >= 50000) {
	                bonus = 5000;
	            } else {
	                bonus = 2000;
	            }
	        }

	        System.out.println(bonus);
	    }
	}