import java.util.Scanner;//importing scanner for input
class MultiplicationTable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);// opening scanner object
		System.out.println("Enter a muber: ");
		int number = input.nextInt();// reading input from the user
		if((number>6)&&(number<9)){
			 for(int i =1;i<=10;i++){
				 System.out.println(number+"*"+i+"="+number*i);//printing multiplication table
			 }
		}
		else{
			System.out.println("Enter number between 6 to 9");
		}
		input.close();//closing scanner object
	}
}