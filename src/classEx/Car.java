package classEx;

public class Car {

	private int number;
	private String model;
	private String color;

	public Car(int number, String model, String color) {
		setNumber(number);
		setModel(model);
		setColor(color);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Car)) {
			return false;
		}
		Car other = (Car) obj;
		return other.number == this.number && other.model.equals(this.model); // Adding more conditions will make the
																				// comparison more specific.
	}

	@Override // Allows to show the Objects in the list once printing the individual Objects
				// and printing the whole list.
	public String toString() {
		return "Car: [number=" + number + ", model=" + model + ", color=" + color + "]";
	}

}
