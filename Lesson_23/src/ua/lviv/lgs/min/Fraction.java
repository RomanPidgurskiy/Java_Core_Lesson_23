package ua.lviv.lgs.min;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fraction {
	
	private String name;

	public Fraction(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private List<Deputy> fraction = new ArrayList<Deputy>();

	
	public void addDeputy() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input lastName Deputy");
		String lastName = sc.next();	
		System.out.println("Input firstName Deputy");
		String firstName = sc.next();	
		
		System.out.println("Input weight");
		Integer weight = sc.nextInt();
		System.out.println("Input height");
		Integer height = sc.nextInt();	
		
		System.out.println("Input age");
		Integer age = sc.nextInt();		
		System.out.println("He takes bribes (false/true)");
		Boolean corrupt = sc.nextBoolean();
		fraction.add(new Deputy(weight,height,lastName,firstName,age,corrupt));
		fraction.get(fraction.size()-1).giveBribe();
		System.out.println("Fraction "+fraction.get(fraction.size()-1).toString());
	}
	
	public void deleteDeputy(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input  last mane  for delete ");
		String lastName = sc.next();	
		
	/*	
		boolean find = false;
		Iterator<Deputy> iterator = fraction.iterator();
		while (iterator.hasNext()) {
			Deputy deputyIterator = iterator.next();
			if (deputyIterator.getLastName().matches(lastName)) {
				iterator.remove();
				find=true;
			}
		}
		if (!find) System.out.println("Такого Депутата "+lastName+" Немає");
		
		*/
		
		Optional<Deputy> findFirst = fraction.stream().filter(s->s.getLastName().equals(lastName)).findFirst();
		if (findFirst.isPresent()) {
			fraction.remove(findFirst.get());
		} else System.out.println("Такого Депутата "+lastName+" Немає");
	
	}
	
	
	
	
	public void getCorruptionist() {
		
		fraction.stream().filter(n->n.isCorruptionist()).forEach(System.out::println);
	}
	
	
	public void getMostCorruptionist() {
	
		
	/*
		Iterator<Deputy> iterator = fraction.iterator();
		int maxBribe = 0;
		Deputy deputy = null;
		while (iterator.hasNext()) {
			Deputy deputyIterator = iterator.next();
			if (deputyIterator.getSizeOfBribe()>maxBribe) {
				maxBribe=deputyIterator.getSizeOfBribe();
				deputy = deputyIterator;
			}
		}
		*/
		
		
		Comparator<Deputy> comparator = Comparator.comparing( Deputy::getSizeOfBribe);
		int maxBribe = fraction.stream().max(comparator).get().getSizeOfBribe();
		fraction.stream().filter(n->n.getSizeOfBribe()==maxBribe).forEach(System.out::println);
		
	}
	
	public void getAllDeputies() {
		fraction.stream().collect(Collectors.toList());
	}	
	
	
	
}
