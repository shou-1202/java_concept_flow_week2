import java.util.Scanner;//importing scanner
import java.util.Random;
class StarPattern2{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);//opening scanner object
    int number = input.nextInt();
	for(int i = 1;i<=number;i++){
			if(i%2==0){
				System.out.println();
			}
			else{
		        for(int j = 0;j<i;j++){
			        System.out.print("*");
		         }
		        for(int j =0;j<2*(number-i);j++){
				    System.out.print(" ");
			    }
	            for(int j = 0;j<i;j++){
				    System.out.print("*");
			    }
			System.out.println();
		    }
	}
	
  }
}