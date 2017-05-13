package programmingBasics;

/**
 * 
 * @author Shchur Pavlo
 *
 */
public class Deposit {
	public static void main(String[] args) {

		double deposit = 1000F, percent = 0.2F, balance = 0F;
		short yearOfDeposit = 2017;
		// iterate from 2017 till 2027 (included)
		for (short year = yearOfDeposit; year <= (yearOfDeposit + 10); year++) {
			balance = (float) (deposit * Math.pow(1 + percent, (year - yearOfDeposit + 1)));
			System.out.println("Your balnce by the end of " + year + " year is " + balance);
		}

	}

}
