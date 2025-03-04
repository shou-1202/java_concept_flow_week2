import java.util.Scanner;//importing scanner
import java.util.Random;
class StarPattern{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);//opening scanner object
    int number = input.nextInt();
	for(int i = 1;i<=number;i += 2){
		for(int j = 0;j<i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	
  }
}