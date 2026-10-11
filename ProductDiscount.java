package packagee;

public class ProductDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 double price = 6000;
	        double discount;
	        double finalPrice;

	        if (price >= 5000) {

	            discount = price * 20 / 100;
	            finalPrice = price - discount;

	        } else {

	            if (price >= 3000) {

	                discount = price * 10 / 100;
	                finalPrice = price - discount;

	            } else {

	                finalPrice = price;
	            }
	        }

	        System.out.println(finalPrice);
	    }
	}