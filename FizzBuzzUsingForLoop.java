import java.util.Scanner;//importing scanner for input
class FizzBuzzUsingForLoop{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);// opening scanner object
		System.out.println("Enter a number: ");
		int number = input.nextInt();// reading input from the user
	    for(int i =0;i<=number;i++){
			if(i%15==0){
				System.out.println("FizzBuzz");
			}
			else if(i%3==0){
				System.out.println("Fizz");
			}
			else if(i%5==0){
				System.out.println("Buzz");
			} 
			else{
				System.out.println(i);
			}
		}
		input.close();//closing scanner object
	}
}