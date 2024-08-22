package _06_Console_Store;
import java.util.Scanner;

import _02_Generics_Store.Candy;
import _02_Generics_Store.Cart;
import _02_Generics_Store.Cereal;
import _02_Generics_Store.Clothing;
import _02_Generics_Store.Food;
import _02_Generics_Store.NonFood;
import _02_Generics_Store.Toy;
public class ConsoleStore{

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */

    public static void main(String[] args){
    	System.out.println("Welcome to the Console Store! You have 20 dollars. We sell candy, cereal, clothing, and toys.");
    	boolean checkedOut = false;
    	Cart<Food, NonFood> cart = new Cart<Food, NonFood>();
    	Scanner scanner = new Scanner(System.in);
    	while (!checkedOut) {
    		System.out.println("Do you want to add an item to your cart? (y/n)");
    		String s = scanner.nextLine();
    		if (s.equals("y")) {
    			System.out.println("Which item do you want to buy?");
        		String item = scanner.nextLine();
        		item = item.toLowerCase();
        		if (item.equals("candy")) {
        			cart.add(new Candy());
        		}
        		else if (item.equals("clothing")) {
        			cart.add(new Clothing());
        		}
        		else if (item.equals("cereal")) {
        			cart.add(new Cereal());
        		}
        		else if (item.equals("toys")) {
        			cart.add(new Toy());
        		}
    		}
    		else {
    			System.out.println("Do you want to remove an item then? (y/n)");
    			String s2 = scanner.nextLine();
    			if (s2.equals("y")) {
    				System.out.println("Which item do you want to remove? Here are the items in the cart:");
    				
    				String itemRemoved = scanner.nextLine();
    				itemRemoved = itemRemoved.toLowerCase();
    				if (itemRemoved.equals("candy")) {
    					
    				}
    			}
    		}
    		System.out.println("Do you want to check out now? (y/n)");
    		String temp = scanner.nextLine();
    		checkedOut = temp.equals("y") ? true : false;
    	}
    	double total = cart.getTotal();
    	if (total > 20.0) {
    		System.out.println("You don't have enough money to pay for this. Do you want to take ");
    	}
    }

}
