import java.util.Scanner;//importing scanner for input
class GreatestFactorOfANumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);// opening scanner object
		System.out.println("Enter a number: ");
		int number = input.nextInt();// reading input from the user
		int greatestFactor = 1;
		for(int i = number-1;i>0;i--){
			if(number%i == 0){
				greatestFactor = i;
				break;
			}
			
		}
		System.out.println(greatestFactor);
		input.close();//closing scanner object
	}
}