import java.util.Scanner;//importing scanner for input
class ToFindFactorOfANumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);// opening scanner object
		System.out.println("Enter a number: ");
		int number = input.nextInt();// reading input from the user
		for(int i = 1;i<number;i++){
			if(number%i == 0){
				System.out.println(i);
			}
		}
		input.close();//closing scanner object
	}
}