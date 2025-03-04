import java.util.Scanner;
class OddAndEvenNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		for(int i =1;i<=number;i++){
			if(i%2!=0){
				System.out.println(i+" -Odd number");
			}
			else{
				System.out.println(i+" -Even number");
			}
		}
	}
}
 