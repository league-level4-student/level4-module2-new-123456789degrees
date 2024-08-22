package _02_Generics_Store;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * The Cart class is a Bounded Type Generic class
 * 
 * <T extends Food> means we can only create a Cart with objects part of the 
 * Food class
 */

@SuppressWarnings("unchecked")
public class Cart<F extends Food, T extends NonFood> {
    private ArrayList <F> cartF;
    private ArrayList<T> cartN;

    public Cart() {
    	cartF = (ArrayList<F>) new ArrayList<Food>();
        cartN = (ArrayList<T>) new ArrayList<NonFood>();
    }

    // Adds an item to the cart
    public void add(F food) {
    	cartF.add(food);
    }
    public void add(T item) {
        cartN.add(item);
    }

    // Displays everything currently in the cart
    public void showCart() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < cartN.size(); i++) {
            if (cartN.get(i) != null) {
                panel.add(cartN.get(i).getNonFood());
            }
        }
        for (int i = 0; i < cartF.size(); i++) {
            if (cartF.get(i) != null) {
                panel.add(cartF.get(i).getFood());
            }
        }
        frame.pack();

    }
    public int length() {
        return cartN.size() + cartF.size();
    }
    public double getTotal() {
    	double total = 0;
    	for (int i = 0; i < cartF.size(); i++) {
    		total += cartF.get(i).getPrice();
    	}
    	for (int i = 0; i < cartN.size(); i++) {
    		total += cartN.get(i).getPrice();
    	}
    	return total;
    }
    
    public void printCart() {
    	for (int i = 1; i <= cartF.size(); i++) {
    		System.out.println("Item " + i + ": " + cartF.get(i-1).getType());
    	}
    }
}
