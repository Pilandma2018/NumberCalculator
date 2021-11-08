package LYT.NumberCalculator;
import java.util.*;

public class Calculator {
public static void main(String[] args) 
{
	int id;
	
//Initializing Scanner Class
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your Student ID: ");
	id = sc.nextInt();
	System.out.println("Student ID: "+id);
	
	//Calculating chapter number
	int chapter = id % 3 + 3;
	
	
	//if chapter 4 go to chapter 6
	if (chapter < 4) {
		chapter = 3;
	} else if (chapter > 4 ) {
		chapter = 5;
	} else {
		chapter = 6;
	}
	System.out.println( "Chapter number remainder = " + chapter);
	//programming exercises
	switch (chapter) {
	case 3:
		int exercise1 = id % 34 + 1;
		System.out.println("Please solve programming exercise " + exercise1 + " from chapter " + chapter + " from page" );
		break;
	case 6:
		int exercise3 = id % 38 + 1;
		System.out.println("Please solve programming exercise " + exercise3 + " from chapter " + chapter + " from page" );
		break;
		
	case 5:
		int exercise2 = id % 46 + 1;
		System.out.println("Please solve programming exercise " + exercise2 + " from chapter " + chapter + " from page" );
		break;
	}
}
}
