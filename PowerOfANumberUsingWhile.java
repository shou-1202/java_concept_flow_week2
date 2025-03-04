import java.util.Scanner;//importing scanner
class PowerOfANumberUsingWhile{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);//opening scanner object
	System.out.println("Enter a number: ");
    int number = input.nextInt();
	System.out.println("Enter power of number: ");
	int power = input.nextInt();
	int result = 1;
	while(power>0){
		result*=number;
		power--;
	}
	System.out.println("Power of the number is "+result);
  }
}