package ua.lviv.lgs.min;

import java.util.Scanner;

public class Deputy extends Human {

	private String lastName;
	private String firstName;
	private int age;
	private boolean corrupt;
	private int sizeOfBribe;
	
	public void giveBribe (){
		System.out.println("Give a bribe");
		if (corrupt) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			Integer bribe = sc.nextInt();
			if (bribe>5000) {
				System.out.println("The police will detain a deputy");
			} else {
				sizeOfBribe=bribe;
			}
		} else {
			System.out.println("This MP does not take bribes");
		}
	}

	public Deputy(int weight, int height, String lastName, String firstName,
			int age,  boolean corrupt) {
		super(weight, height);
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.corrupt = corrupt;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isCorruptionist() {
		return corrupt;
	}

	public void setCorruptionist(boolean corruptionist) {
		this.corrupt = corruptionist;
	}

	public int getSizeOfBribe() {
		return sizeOfBribe;
	}

	public void setSizeOfBribe(int sizeOfBribe) {
		this.sizeOfBribe = sizeOfBribe;
	}

	@Override
	public String toString() {
		return "Deputy  LastName = " + lastName + ", FirstName = " + firstName
				+ super.toString()
				+ ", Age=" + age + ", Corruptionist=" + corrupt
				+ ", Habar_Size=" + sizeOfBribe;
	}

}