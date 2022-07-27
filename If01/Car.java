package If01;

public class Car {
	private double fuelCost;
	private double fuelAmount;

	public Car(double fuelCost,double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

	public void move(double distance) {
		this.fuelAmount -= distance/fuelCost;
		System.out.println(distance+ "km　走ります");
	}

	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
