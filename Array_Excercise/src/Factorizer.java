import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factorizer {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("What number would you like to factor? ");

		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		int num = Integer.parseInt(input);

		// TODO Auto-generated method stub
		
		int counter=0;
		List<Integer> numArray=new ArrayList<>();
		for (int i = 1; i <= num; ++i) {
			// if number is divided by i
			// i is the factor
			
			if (num % i == 0) {
				counter++;	
				numArray.add(i);
			}
			
		}
		System.out.println("The factors of "+num+" are:");
		for(int s:numArray) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println(+num+" has "+counter+" factors.");
		
		int arraySum=0;
		for(int j=0; j<numArray.size()-1; j++ ) {
			arraySum+=numArray.get(j);
		}
		if(arraySum==num) {
		System.out.println(+num+" is a perfect number.");
		}
		else
			System.out.println(+num+" is not a perfect number.");
		
		if(numArray.size()==2 && numArray.get(0)==1 && numArray.get(1)==num) {
			System.out.println(+num+" is a prime number.");
		} else
			System.out.println(+num+" is not a prime number.");
	
	}
	
}


