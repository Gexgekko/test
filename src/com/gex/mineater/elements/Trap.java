package com.gex.mineater.elements;

public class Trap extends Cell {
	private String fullName;
	private TrapEffect effect;
	public static String[] trapType = {"Fire", "Ice", "Earth"};
	public static String[] trapStyle = {"trap", "destroyer", "obstacle", "pit", "jaw", "cage", "hell"};
	public static String[] trapFinish = {"doom", "Doom", "boredom", "chaos", "destruction", "rabbit deployment"};
	
	
	public static String generateFullName() {
		int num = (int)Math.floor(Math.random()*(trapType.length));
		String fullName = trapType[num];
		num = (int)Math.floor(Math.random()*(trapStyle.length));
		fullName += " " + trapStyle[num] + " of ";
		num = (int)Math.floor(Math.random()*(trapFinish.length));
		fullName += trapFinish[num];
		
		return fullName;
	}
	
	public Trap(boolean isFixed, boolean isSteppable, TrapEffect effect, String fullName) {
		super(isFixed, isSteppable);
		this.effect = effect;
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public TrapEffect getEffect() {
		return effect;
	}

	public void setEffect(TrapEffect effect) {
		this.effect = effect;
	}
	
	

}
