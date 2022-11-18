import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int amount=1000;
		int withdraw,deposite;
		
		while(true) {
			System.out.println("Welcome to ATM: ");
			System.out.println("Press 1 for Deposite: ");
			System.out.println("Press 2 for Withdraw: ");
			System.out.println("Press 3 for Check Balance: ");
			System.out.println("Press 4 for Exit: ");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter amount to be Deposite: ");
				deposite=sc.nextInt();
				amount+=deposite;
				System.out.println(deposite+" Deposited successfully: ");
				break;
			case 2:
				System.out.println("Enter amount to be withdrawn: ");
				withdraw=sc.nextInt();
				if(withdraw<amount) {
					amount-=withdraw;
					System.out.println(withdraw+" Withdrawn successfully: ");
					System.out.println("Collect your money: ");
				}
				else {
					System.out.println("Insufficient Balance: ");
				}
				break;
			case 3:
				System.out.println("Your Balance is: "+amount);
				break;
			case 4:
				System.exit(0);
			}
			
			
		}
	}

}
