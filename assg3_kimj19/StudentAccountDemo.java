package assg3_kimj19;

public class StudentAccountDemo {

	public static void main(String[] args) {
		//testing default constructor method
		StudentAccount s1 = new StudentAccount();
		StudentAccount s2 = new StudentAccount(50);
		StudentAccount s3 = new StudentAccount(100);
		StudentAccount s4 = new StudentAccount(-1);
		StudentAccount s5 = new StudentAccount(200);
		StudentAccount s6 = new StudentAccount(200);
		//testing getMethods
		
		System.out.println("testing get methods");
		System.out.println(s1.getAcctNo());
		System.out.println(s2.getBalance());
		System.out.println(s3.getCounter());
		//Testing the set methods
		s1.setBalance(50);
		System.out.println("\nTesting set methods");
		System.out.println("The new account balance is " + s1.getBalance());
	    // Testing deposit method 
		System.out.println("\nTesting deposit methods");
		s2.deposit(100);
		s3.deposit(-10);
		System.out.println("s2 value of 100 " + s2);
		System.out.println("s3 value of -10 " + s3);
		//Testing the charge method
		System.out.println("\nTesting the charge method");
		s2.charge(100);
		s3.charge(-10);
		System.out.println("s2 value of 100 " + s2 );
		System.out.println("s3 value of -10" + s3);
		//Testing transferIn
		System.out.println("\nTesting the transferIn method");
		s2.transferIn(s5, 50);
		s3.transferIn(s4, -10);
		System.out.println("s5 transfer money into s2 " + s2.getBalance());
		System.out.println("s4 transfer money into s3 " + s3.getBalance());
		//Testing transferOut
		System.out.println("\nTesting transferOut");
		s2.transferOut(s5, 50);
		s3.transferOut(s4, -10);
		System.out.println("s5 transfer money out to s2 " + s2.getBalance());
		System.out.println("s4 transfer money out to s3 " + s2.getBalance());
		//Testing the printInfo
		System.out.println("\nTesting the printInfo from Student Account");
		s2.printInfo();
		s3.printInfo();
		s4.printInfo();
		//Testing the toString method
		System.out.println("\nTesting the toString method");
		System.out.println("s2 info");
		System.out.println(s2.toString());
		System.out.println("s3 info");
		System.out.println(s3.toString());
		//Testing the CompareTo method
		System.out.println("\nTesting the CompareToMethod");   
		if (s5.compareTo(s1) == 1){ // Making it print 1 from studentAccount class
			System.out.println("s5 is greater than s1");
		}
		
		else if(s1.compareTo(s5) == -1) //Making it print -1 from studentAccount class
			System.out.println("s1 is less than s5");
		if (s5.compareTo(s6)== 0) { // set it equal to each other for it to print 0
			System.out.println("They are equal to each other");
		}
		//Testing constructor methods for RewardsAccount
		RewardsAccount r1 = new RewardsAccount();
		RewardsAccount r2 = new RewardsAccount(50);
		RewardsAccount r3 = new RewardsAccount(101);
		
		// testing the get method for rewardsAccount
		System.out.println("\nTesting the getMethod for rewards");
		System.out.println(r2.getRewards(50));
		System.out.println(r3.getRewards(101));
		
			// Testing the ToString method in rewardsAccount
			System.out.println("\nTesting the ToString method in rewardsAccount");
			System.out.println("r2 info");
			System.out.println(r2.toString());
			System.out.println("r3 info");
			System.out.println(r3.toString());
			// Testing the deposit method in rewardsAccount
			System.out.println("\nTesting the deposit method in rewardsAccount");
			r2.deposit(50);
			r3.deposit(-10);
			System.out.println("r2 value of 50  " + r2);
			System.out.println("r3 value of -10  " + r3);
			//Testing the printInfo in RewardsAccount
			System.out.println("\nTesting the printInfo in RewardsAccount");
			r2.printInfo();
			r3.printInfo();
	}
	

}
