import java.util.Scanner;//importing scanner
import java.util.Random;
class PowerOfANumber{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);//opening scanner object
	System.out.println("Enter a number: ");
    int number = input.nextInt();
	System.out.println("Enter power of number: ");
	int power = input.nextInt();
	int result = 1;
	for(int i =0;i<power;i++){
		result *= number;//calculating power
	}
	System.out.println("Power of the number is "+result);
	
  }
}