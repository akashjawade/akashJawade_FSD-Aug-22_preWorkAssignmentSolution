package preworkassignment1;

import java.util.Scanner;

public class Main {
	
	Scanner sc=new Scanner(System.in);

//---------------function to checkPalindrome-------------------------------
	public void checkPalindrome()  {
		
		System.out.print("Enter a number to check whether it is palindrome number or not: ");
		int num1= sc.nextInt();
        int org_num=num1;
        int rev=0;

        while(num1 != 0){
            rev=(rev*10)+(num1%10);
            num1=num1/10;
        }
        //System.out.println("Reversed Number is: " + rev);
        if(org_num == rev)
            System.out.println(org_num +" is Palindrome Number.");
        else
            System.out.println(org_num +" is not a Palindrome Number.");
        
        System.out.println();
	}
	
//---------------function to printPattern----------------------------------
    public void printPattern() {
    	System.out.print("Enter number of levels you want in pattern: ");
		int num2 = sc.nextInt();

		boolean spaceNeeded = true;

		for(int i=1; i<=num2; i++)
		{
			for(int j=num2; j>=i; j--)
			{
				System.out.print("*");
				if (i<j)
					spaceNeeded=true;
				else
					spaceNeeded=false;
				if(spaceNeeded)
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
    }
//---------------function to check no is prime or not------------------------------
    public void checkPrimeNumber() {
        	System.out.print("Enter a number to check whether it is prime number or not: ");

    		int num3=sc.nextInt();
    		int temp = 0;
    		if(num3==0 || num3==1)
    			System.out.println(num3 +" is not a prime number.");

    		if (num3>=2)
    		{
    			for(int i=2; i<num3; i++)
    		{
    			if(num3%i == 0)
    				temp=temp+1;
    		}
    		

    		if(temp>0)
    			System.out.println(num3 +" is not a prime number.");
    		else
    			System.out.println(num3+ " is prime number.");
    		
    		}
    		System.out.println();
    }
		
//--------------function to print Fibonacci-Series-------------------------------
    public void printFibonacciSeries() {
    	int first = 0, second = 1;
    	System.out.print("Number sould be >2.\n"+"Enter number to print fibonacci series: ");
		int num4=sc.nextInt();
		System.out.print(first+" "+second);

		for(int i=1; i<=num4-2; i++)
			{
				int addition = first + second;
				System.out.print(" "+addition);
				first=second;
				second=addition;
			}
		System.out.println("\n");
	   }
    
  //main method which contains switch and do while loop
		
	public static void main(String[] args) {	
		Main obj=new Main();
		int choice;
		Scanner sc = new Scanner(System.in);
		
		do {

			System.out.println("Operations that can be perfom are as follows: \n" + "1. Find palindrome of number.\n" + 
			"2. Print Pattern for a given number.\n" + "3. Check whether the number is a prime number.\n"
			+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
			System.out.println();

			System.out.print("Enter your choice from above list: ");
		   	
		
			choice =sc.nextInt();
			
			switch(choice) {
			case 0: choice = 0;
			break;
				
			case 1: obj.checkPalindrome();
			break;
			
			case 2: obj.printPattern();
			break;
			
			case 3: obj.checkPrimeNumber();
			break;
			
			case 4: obj.printFibonacciSeries();
			break;
			
			default : System.out.println("Invalid choice. Enter a valid no.\n");
			
			}
			}
			while (choice != 0);

			System.out.println("Exited Successfully!!!");

			sc.close();
		}
	}

		    
