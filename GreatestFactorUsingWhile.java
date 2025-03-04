import java.util.Scanner;//importing scanner
import java.util.Random;
class GreatestFactorUsingWhile{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);//opening scanner object
	System.out.println("Enter a number: ");
    int number = input.nextInt();
	int counter = number-1;
	int greatestFactor = 1;
	while(counter>0){
		if(number%counter==0){
			greatestFactor = counter;
			break;
		}
		counter--;
	}
	System.out.println("Greatest factor of "+number+" is "+greatestFactor);
  }
}