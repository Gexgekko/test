package com.gex.mineater.elements;

public class Player {
	private String name;
	private String title;
	private String surname;
	private static String[] nameList = {"Solomon", "Jorgen", "Kanye", "Joe", "Nick", "Cadence"};
	private static  String[] titleList = {"The sleepy", "The creep", "The weirdo", "The self-conscious AI", "The self-aware AI"};
	private static String[] surnameList = {"Sample text", "Pérez", "Tructos", "Korga"};
	
	public static String[] generateFullName() {
		int num = (int)Math.floor(Math.random()*(nameList.length));
		String name = nameList[num];
		num = (int)Math.floor(Math.random()*(titleList.length));
		String title = "\"" + titleList[num] + "\"";
		num = (int)Math.floor(Math.random()*(surnameList.length));
		String surname = surnameList[num];
		
		String[] fullName = {name, title, surname};
		return fullName;
	}
	
	
	public Player(String name, String title, String surname) {
		this.name = name;
		this.title = title;
		this.surname = surname;
	}
	
	public Player() {
		this.name = null;
		this.title = null;
		this.surname = null;
	}

	public void stepOn(Cell cell) {
		if(cell.isSteppable) {
			System.out.println("Is steppable");
		} else {
			System.out.println("Is not steppable");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
}
