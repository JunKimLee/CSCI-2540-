/**
 * @author Daniel Kim
 * This class is a subclass of StudentAccount class. It has a new variable (rewards – using double 
type) that records the rewards balance.  we practice the use of super to call functions
from the StudentAccount class
 */
package assg3_kimj19;

public class RewardsAccount extends StudentAccount {
	
	private double rewardsBalance;
	/**
	 * deafult constructor
	 */
	public RewardsAccount() {
		super(); // calls the parameter from StudentAccount
		rewardsBalance = 0;
	}
	/**
	 * 
	 * @param initial if its greater than or equal to 100 the rewardsBalance gets added by 5
	 */
	public  RewardsAccount(double initial) {
		super(initial);// calls the 1 parameter from StudentAccount
		if (initial >= 100)
			rewardsBalance += 5;
		
	
	}
	/**
	 * retrieves the getRewards
	 * @param rewardsBalance
	 * @return as rewardsBalance
	 */
	public double getRewards(double rewardsBalance) {
		return rewardsBalance;
	}
	/**
	 * if the rewardsBalance is less than 25 prints a error message of sys.out.println of 
	 * "there is insufficient amount for redeeming the rewards"
	 * or the getBalance from StudentAccount gets added to the rewardsBalance
	 */
	public void redeemRewards() {
		if (rewardsBalance < 25)
			System.out.println ("there is insufficient amount for redeeming the rewards");
		else {
			 setBalance(getBalance()+ rewardsBalance);
		}
	}
	/**
	 * returns a string with information it calls the toString from StudentAccount and it prints out rewardsBalance
	 */
	public String toString() {
		return super.toString() + "Rewards Balance:" + rewardsBalance;
	}
	/**
	 * if deposit is greater than or equal to 100 rewardBalance gets added to 5 and deposit from studentAccount is being called
	 */
	public void deposit(double deposit) {
		if (deposit >= 100)
			rewardsBalance += 5;
		super.deposit(deposit);
	}
	/**
	 * the printInfo just prints 
	 */
	public void printInfo() {
		System.out.println(this);
	}
}
