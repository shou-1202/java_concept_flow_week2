import java.util.Scanner;//importing scanner for input
class ToFindYoungestAndTallestFriend{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);// opening scanner object
		System.out.println("Enter age and height of Amar: ");
		int ageOfAmar = input.nextInt();// reading input from the user
		double heightOfAmar = input.nextDouble();
		System.out.println("Enter age and height of Akbar: ");
		int ageOfAkbar = input.nextInt();
		double heightOfAkbar = input.nextDouble();
		System.out.println("Enter age and height of Anthony: ");
		int ageOfAnthony = input.nextInt();
		double heightOfAnthony = input.nextDouble();
	    if((ageOfAkbar<ageOfAmar)&&(ageOfAkbar<ageOfAnthony)){
			System.out.println("Akbar is youngest");
		}
		if((ageOfAmar<ageOfAkbar)&&(ageOfAmar<ageOfAnthony)){
			System.out.println("Amar is youngest");
		}
		if((ageOfAnthony<ageOfAkbar)&&(ageOfAnthony<ageOfAmar)){
			System.out.println("Anthony is youngest");
		}
		if((heightOfAmar>heightOfAkbar)&&(heightOfAmar>heightOfAnthony)){
			System.out.println("Amar is tallest");
		}
		if((heightOfAkbar>heightOfAmar)&&(heightOfAkbar>heightOfAnthony)){
			System.out.println("Akbar is tallest");
		}
		if((heightOfAnthony>heightOfAmar)&&(heightOfAnthony>heightOfAkbar)){
			System.out.println("Anthony is tallest");
		}
		input.close();//closing scanner object
	}
}