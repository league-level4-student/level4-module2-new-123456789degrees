package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Cereal extends Food{
	private double price = 5.00;
	private String type = "Cereal";
	public Cereal() {
		if(new Random().nextBoolean()) {
			this.item = "cereal1.jpeg";
		}
		else {
			this.item = "cereal2.jpeg";
		}
	}

	@Override
	public JLabel getFood() {
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
