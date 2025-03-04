import java.util.Scanner;//importing scanner
import java.util.Random;
class MultiplesOfANumber{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);//opening scanner object
	System.out.println("Enter a number: ");
    int number = input.nextInt();
	int i = 1;
	while(i<101){
		if(number%i==0){
			System.out.println("multiple found: "+i);
		}
		i++;
	}
	
  }
}