import java.util.ArrayList;
import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{	
		System.out.print("Would you like to...\n(1) Add a recipe?\n(2) Search for a recipe?\n   // ");
		Scanner scInt = new Scanner( System.in);
		int choice = scInt.nextInt();
		
		//Instantiate the objects
		CookBook book = new CookBook();
		Recipe recipe = new Recipe();
		
		if (choice == 1)
		{
			ArrayList<String> Recipe = new ArrayList<String>();
			Recipe = recipe.addRecipe();
			recipe.toBook(Recipe);
		}
		
		if (choice == 2)
		{
			
		}
		
	}
}
