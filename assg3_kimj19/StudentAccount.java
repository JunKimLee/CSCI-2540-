/**
 * @author Daniel Kim
 * The point of this assignment was to do constructor methods and for the RewardsAccount to be a subclass of this class
 * we practiced using the method of super to call functiosns from this class. Also used the static method such as the counter++
 * and used similar methods from assignment 2. Pretty much the same thing as assignment 2 on this page but just learned how to use subclass
 * and super methods lol.
 */
package assg3_kimj19;

	public class StudentAccount {
		private double accountNumber;
		private double accountBalance;
		private static int counter = 0;
		/**
		 *  default constructor 
		 */
		public StudentAccount() {
			counter++;
			accountNumber = counter++;
			accountBalance = 0;
}	/**
     *
     *@param accountNumber give value is the static method counter++
     *@param accountBalance given value is b
     */
		public StudentAccount(double b) {
			accountNumber = counter++;
			accountBalance = b;
			counter++;
	}    
		/**
	      *
	      *@return it retrives accountNumber
	      */
		public double getAcctNo() {
			return accountNumber;
		}
		/**
		  *@return it retrives accountBalance
		  */
		public double getBalance () {
			return accountBalance;
		}
		/**
		 * @return it retrieves accountNumber
		 */
		public double getCounter () {
			return accountNumber;
		}
		/**
		 * it modifies accountBalance and sets it to newAccountBalance
		 * @param newAccountBalance
		 */
		public void setBalance(double newAccountBalance) {
			accountBalance = newAccountBalance;
		}
		/**
		 * If we set the depositAmount less than 0 it prints a error message
		 * as sys.out method "the account balance should be updated accordingly"
		 * or else accountBalance adds to depositAmount
		 * @param depositAmount
		 */
		public void deposit (double depositAmount) {
			if (depositAmount < 0) {
				System.out.println("Error cant print negative numbers");
					 
			}
			else{
				accountBalance += depositAmount;
			}
		}
		/**
		 * if giveCharge is less than 0 prints a error message 
		 * in a form of sys.out "The new balance is allowed to be negative."
		 * @param giveCharge
		 */
		public void charge(double giveCharge) {
			if (giveCharge < 0) {
				System.out.println("Error it must be a postive number");
		}
		else {
			accountBalance -= giveCharge;
		}
		}
		/**
		 * If transgerI is less than 0 it print a error message
		 * in sys.out for "It cannot transfer a negative amount"
		 * @param a
		 * @param transferI
		 */
		public void transferIn(StudentAccount a, double transferI) {
			if (transferI < 0) {
				System.out.println("Dont transfer negative amount of money");			
			}
		else {
			this.accountBalance += transferI;
			a.accountBalance -= transferI;
		}
		}
		/**
		 * If trasnferO is less than 0 it prints an error message
		 * It sys.out "It cannot transfer a negative amount
		 * @param a
		 * @param transferO
		 */
		public void transferOut(StudentAccount a, double transferO) {
			if (transferO < 0) {
				System.out.println("Dont transfer out negative amount of money");			
			}
		else {
			this.accountBalance -= transferO;
			a.accountBalance += transferO;
		}
		}
		/**
		 * It prints the toString
		 */
		public void printInfo() {
			System.out.println(this);
		}
		/**
		 * toString is a method that prints Account number and Current Balance
		 * 
		 */
		@Override
		public String toString() {
			return "Account number :" + accountNumber + "\n" +"Current Balance:" + accountBalance;
		}
		/**
		 * Compareto method it compares the (this. value to a.)to be able to print out 
		 * @param a
		 * @return
		 */
		public int compareTo(StudentAccount a) {
			if (this.accountBalance > a.accountBalance)
				return 1;
			else if (this.accountBalance == a.accountBalance)
				return 0;
			else 
				return -1;
		}
	}
