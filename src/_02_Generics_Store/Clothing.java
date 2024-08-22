package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Clothing extends NonFood{
	private double price = 17.50;
	private String type = "Clothing";
	public Clothing() {
		if(new Random().nextBoolean()) {
			this.item = "clothing1.jpeg";
		}
		else {
			this.item = "clothing2.jpeg";
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
