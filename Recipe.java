import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Recipe 
{
	public static ArrayList<String> addRecipe()
	{
		Scanner scInt = new Scanner( System.in);
		Scanner sc = new Scanner( System.in);
		ArrayList<String> Recipe = new ArrayList<String>();
		
		System.out.print("Recipe Name: ");
		String name = sc.nextLine();
		Recipe.add(name);
		
		System.out.print("Recipe Description: ");
		String description = sc.nextLine();
		Recipe.add(description);
		
		System.out.print("How many ingredients?\n  // ");
		String ingredientNum = sc.nextLine();
		Recipe.add(ingredientNum);
		
		System.out.print("How many steps?\n  // ");
		String stepNum = sc.nextLine();
		Recipe.add(stepNum);
		
		//Adds the ingredient and measure to the recipe array list
		for (int i = 0; i < Integer.parseInt(ingredientNum); i++)
		{
			System.out.print("Ingredient #" + (i + 1) + ": ");
			String ingredient = sc.nextLine();
			Recipe.add(ingredient);
			
			System.out.print("Amount: ");
			String measure = sc.nextLine();
			Recipe.add(measure);
		}
		
		for (int i = 0; i < Integer.parseInt(stepNum); i++)
		{
			System.out.print("Step #" + (i + 1) + ": ");
			String step = sc.nextLine();
			Recipe.add(step);
		}
		
		return Recipe;
	}
	
	public void toBook(ArrayList<String> Recipe)
	{
		try 
		{ 
			BufferedWriter out = new BufferedWriter(new FileWriter(Recipe.get(0))); 
			
			int ingredientNum = Integer.parseInt(Recipe.get(2));
			int stepNum = Integer.parseInt(Recipe.get(3));
			
			String finalRecipe = "";
			
			finalRecipe += ("Title: " + Recipe.get(0));
			
			finalRecipe += "\n";
			
			finalRecipe += ("Description: " + Recipe.get(1));
			
			finalRecipe += ("\n\nIngredients:\n");
			
			int counter = 1;
			
			for (int i = 4; i < ingredientNum*2 + 4; i++)
			{
				finalRecipe += ((counter) + ". " + Recipe.get(i) + "\n");
				finalRecipe += ("   Measure: " + Recipe.get(i + 1) + "\n");
				counter++;
				i++;
				
			}
			
			finalRecipe += ("\nDirections: \n");
			
			for (int i = 4 + ingredientNum*2; i < ((4 + ingredientNum*2) + (stepNum)); i++)
			{
				finalRecipe += ((i - (3 + ingredientNum*2)) + ". " + Recipe.get(i) + "\n");
			}
			
			System.out.println(finalRecipe);
			out.write(finalRecipe);
			out.close(); 
			
		} catch (IOException e) {} 
	}
	
	
}
