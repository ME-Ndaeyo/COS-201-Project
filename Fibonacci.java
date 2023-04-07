import java.util.Scanner;
class Fibonacci
{	
    public static void main(String[] args) {		
        System.out.println("Input the number of terms you want below:");		
        //State the variables to be used		
        Scanner sc=new Scanner(System.in);		
        int n=sc.nextInt();		
        int first_term = 0;		
        int second_term = 1;		
        System.out.println("Displaying the Fibonacci sequence for the first "+ n +" terms starting with 0 as the first number: \n" + first_term + "\n" + second_term);		
        /*use for.....loop to loop through 1-any variables the user chooses*/		
        for(int i = 1; i<n; i++){			
            //Compute the sequence			
            int Total = first_term + second_term;			
            first_term = second_term;			
            second_term = Total;			
            System.out.println(Total);		
        }	
    }
}