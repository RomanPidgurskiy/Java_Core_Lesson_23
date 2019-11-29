package ua.lviv.lgs.min;
public class Human {
	private int weight;
	private int height;

	
	public Human(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}


	@Override
	public String toString() {
		return ", Weight=" + weight + ", Height=" + height;
	}
	

}
