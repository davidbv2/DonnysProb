	import java.util.Scanner;

public class ArrayProb {

public static void main(String[] args) {
		
		        int count = 0;

		        Scanner s = new Scanner(System.in);

		        int[] DonnysNums = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,7,7};

		        System.out.println("Enter the element of which you want to count number of occurrences:");

		        int x = s.nextInt();

		       for(int i = 0; i < DonnysNums.length; i++)

		        { if(DonnysNums[i] == x)

		            { count++;

		            }

		    }    
		       System.out.println("Number of Occurrence of the Element:"+count);

		    }

}


