package com;

import java.util.Scanner;

public class Console 
{

	public Console()
	{
		System.out.println("----------------------------------------------------------------");
		System.out.println("--------------- Welcome to FedUni Results Manager --------------");
		System.out.println("----------------------------------------------------------------");
	}
	
	public void showMenu()
	{
		System.out.println("Main Menu -  Please select an option");
		System.out.println("1.) Add Course");
		System.out.println("2.) Add Student");
		System.out.println("3.) Add Result");
		System.out.println("4.) View Result");
		System.out.println("5.) Quit");
		
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number == 1)
		{
			addcourse();
		}
		else if(number == 2)
		{
			addstudent();
		}
		else if(number == 3)
		{
			addresult();
		}
		else if(number == 4)
		{
			viewresult();
		}
		else if(number == 5)
		{
			
		}
		else
		{
			System.out.println("Invalid Number");
		}
			
	}
	
	private void viewresult() {
		// TODO Auto-generated method stub
		
	}

	private void addresult() 
	{
		// TODO Auto-generated method stub
		
	}

	private void addstudent()
	{
		// TODO Auto-generated method stub
		
	}

	private void addcourse() 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter course code:");
		String course_code = input.nextLine();

		System.out.println("Please enter course name:");
		String course_name = input.nextLine();
		
		

		input.close();
	}


}
