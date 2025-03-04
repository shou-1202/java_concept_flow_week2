import java.util.Scanner;//importing scanner for input
class ToFindBonusOfEmployee{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);// opening scanner object
		System.out.println("Enter your salary: ");
		double salary = input.nextDouble();// reading input from the user
		System.out.println("Enter your years of service: ");
		int yearsOfService = input.nextInt();
		if(yearsOfService>5){
			double bonusAmount = 0.05*salary;// calculating bonus amount
			System.out.println("Bonus amount: "+bonusAmount);// printing bonus amount
		}
		input.close();//closing scanner object
	}
}