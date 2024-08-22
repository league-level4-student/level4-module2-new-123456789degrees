package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Toy extends NonFood {
	private double price = 6.50;
	private String type = "Toy";
	public Toy() {
		if(new Random().nextBoolean()) {
			this.item = "toy1.jpeg";
		}
		else {
			this.item = "toy2.jpeg";
		}
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}
}
